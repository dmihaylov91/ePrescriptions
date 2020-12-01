package com.ibm.eprescription.restclient.exception;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus.Series;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import com.ibm.eprescription.model.P099_Message;

@Component
public class EPrescriptionResponseErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return !response.getStatusCode().series().equals(Series.SUCCESSFUL);
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {

		P099_Message errorMessage = new P099_Message();

		if (response.getStatusCode().equals(HttpStatus.UNAUTHORIZED)) {
			errorMessage.setHttpStatus(response.getStatusCode());
			errorMessage.setErrorMessage(response.getRawStatusCode() + " " + response.getStatusText());
			throw new EPrescriptionResponseException(errorMessage);
		}

		try {
			if (response.getBody() != null) {
				final JAXBContext jaxbContext = JAXBContext.newInstance(P099_Message.class);
				final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				errorMessage = (P099_Message) jaxbUnmarshaller.unmarshal(response.getBody());
			}

			errorMessage.setHttpStatus(response.getStatusCode());
			errorMessage.setErrorMessage(response.getRawStatusCode() + " " + response.getStatusText());

			throw new EPrescriptionResponseException(errorMessage);
		} catch (final JAXBException e) {
			errorMessage.setHttpStatus(response.getStatusCode());
			errorMessage.setErrorMessage(e.getMessage());

			throw new EPrescriptionResponseException(errorMessage);
		}

	}

}
