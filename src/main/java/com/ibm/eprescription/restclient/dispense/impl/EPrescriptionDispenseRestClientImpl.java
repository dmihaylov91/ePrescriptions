package com.ibm.eprescription.restclient.dispense.impl;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.ibm.eprescription.model.EPrescriptionErrorMessage;
import com.ibm.eprescription.model.P005_Message;
import com.ibm.eprescription.model.P006_Message;
import com.ibm.eprescription.restclient.AbstractEPrescriptionRestClient;
import com.ibm.eprescription.restclient.dispense.EPrescriptionDispenseRestClient;
import com.ibm.eprescription.restclient.exception.EPrescriptionResponseException;

@Service
public class EPrescriptionDispenseRestClientImpl extends AbstractEPrescriptionRestClient<P005_Message, P006_Message>
		implements EPrescriptionDispenseRestClient {

	private String uri;

	@Override
	public P006_Message dispenseMedicalPrescription(P005_Message prescription) {
		try {
			return this.getResponse(prescription);
		} catch (EPrescriptionResponseException e) {
			return new P006_Message(e.getErrorMessage());
		} catch (Exception e) {
			return new P006_Message(new EPrescriptionErrorMessage(e.getMessage()));
		}
	}

	@Override
	protected HttpMethod getHttpMethod() {
		return HttpMethod.POST;
	}

	@Override
	protected Class<P006_Message> getResponseClass() {
		return P006_Message.class;
	}

	@Override
	protected String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
