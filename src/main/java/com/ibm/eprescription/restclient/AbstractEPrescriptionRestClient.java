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
package com.ibm.eprescription.restclient;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author DimitarMihaylov
 */

public abstract class AbstractEPrescriptionRestClient<Request, Response> {
	protected static final String HEADER_CONTENT_TYPE = "Content-Type";
	protected static final String HEADER_CONTENT_TYPE_XML = "application/xml";

	protected String apiEndPoint;
	protected RestTemplate restTemplate;

	protected Response getResponse(final Request request) {
		final HttpEntity<Request> requestEntity = new HttpEntity<Request>(request, getHeaders());
		return restTemplate.exchange(getUrl(), getHttpMethod(), requestEntity, getResponseClass()).getBody();

	}

	protected MultiValueMap<String, String> getHeaders() {
		final MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add(HEADER_CONTENT_TYPE, HEADER_CONTENT_TYPE_XML);

		return headers;
	}

	protected String getUrl() {
		return apiEndPoint + getUri();
	}

	protected abstract HttpMethod getHttpMethod();

	protected abstract Class<Response> getResponseClass();

	protected abstract String getUri();

	/**
	 * @param apiEndPoint the apiEndPoint to set
	 */
	public void setApiEndPoint(final String apiEndPoint) {
		this.apiEndPoint = apiEndPoint;
	}

	/**
	 * @param restTemplate the restTemplate to set
	 */
	public void setRestTemplate(final RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

}
