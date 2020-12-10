/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2020 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */

package com.ibm.eprescription.restclient.search.impl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.ibm.eprescription.model.EPrescriptionErrorMessage;
import com.ibm.eprescription.model.P003_Message;
import com.ibm.eprescription.model.P004_Message;
import com.ibm.eprescription.restclient.AbstractEPrescriptionRestClient;
import com.ibm.eprescription.restclient.exception.EPrescriptionResponseException;
import com.ibm.eprescription.restclient.search.EPrescriptionSearchRestClient;

/**
 * @author DimitarMihaylov
 */
@Service
public class EPrescriptionSearchRestClientImpl extends AbstractEPrescriptionRestClient<P003_Message, P004_Message>
		implements EPrescriptionSearchRestClient {

	private String uri;

	@Override
	public P004_Message searchForEPrescriptions(final P003_Message searchCriteria) {

		try {
			return this.getResponse(searchCriteria);
		} catch (EPrescriptionResponseException e) {
			return new P004_Message(e.getErrorMessage());
		} catch (Exception e) {
			return new P004_Message(new EPrescriptionErrorMessage(e.getMessage()));
		}
	}

	@Override
	public P004_Message searchForEPrescriptions() {

		try {
			File file = ResourceUtils.getFile("classpath:xml/NHIS-P003-Simplified.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(P003_Message.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			P003_Message requestMessage = (P003_Message) jaxbUnmarshaller.unmarshal(file);

			return this.getResponse(requestMessage);
		} catch (EPrescriptionResponseException e) {
			return new P004_Message(e.getErrorMessage());

		} catch (Exception e) {
			return new P004_Message(new EPrescriptionErrorMessage(e.getMessage()));
		}
	}

	@Override
	public P004_Message dummySearchForEPrescriptions() {
		try {
			File file = ResourceUtils.getFile("classpath:xml/NHIS-P004-Simplified.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(P004_Message.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			P004_Message res = (P004_Message) jaxbUnmarshaller.unmarshal(file);

			return res;
		} catch (EPrescriptionResponseException e) {
			return new P004_Message(e.getErrorMessage());

		} catch (Exception e) {
			return new P004_Message(new EPrescriptionErrorMessage(e.getMessage()));
		}
	}

	@Override
	protected HttpMethod getHttpMethod() {

		return HttpMethod.POST;
	}

	@Override
	protected Class<P004_Message> getResponseClass() {

		return P004_Message.class;
	}

	@Override
	protected String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
