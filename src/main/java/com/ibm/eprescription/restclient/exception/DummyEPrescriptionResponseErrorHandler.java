package com.ibm.eprescription.restclient.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpStatus.Series;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.ResponseErrorHandler;

import com.ibm.eprescription.model.EPrescriptionErrorMessage;
import com.ibm.eprescription.model.P099_Message;

@Component
public class DummyEPrescriptionResponseErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return !response.getStatusCode().series().equals(Series.SUCCESSFUL);
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {

		EPrescriptionErrorMessage errorMessage = new EPrescriptionErrorMessage();
		errorMessage.setHttpStatus(response.getStatusCode());
		errorMessage.setErrorMessage(response.getRawStatusCode() + " " + response.getStatusText());
		try {
			File file = ResourceUtils.getFile("classpath:xml/NHIS-P099-Simplified.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(P099_Message.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			P099_Message message = (P099_Message) jaxbUnmarshaller.unmarshal(file);

			if (message.getContents() != null && !CollectionUtils.isEmpty(message.getContents().getError())) {
				errorMessage.setError(message.getContents().getError());
			}

			throw new EPrescriptionResponseException(errorMessage);

		} catch (FileNotFoundException e) {
			errorMessage.setErrorMessage(e.getMessage());
			throw new EPrescriptionResponseException(errorMessage);
		} catch (JAXBException e) {
			errorMessage.setErrorMessage(e.getMessage());
			throw new EPrescriptionResponseException(errorMessage);
		}
	}

}
