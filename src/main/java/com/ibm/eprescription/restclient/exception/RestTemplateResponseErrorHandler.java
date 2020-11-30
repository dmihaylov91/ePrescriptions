package com.ibm.eprescription.restclient.exception;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpStatus.Series;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

@Component
public class RestTemplateResponseErrorHandler implements ResponseErrorHandler {

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		return !response.getStatusCode().series().equals(Series.SUCCESSFUL);
	}

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		String responseBody = IOUtils.toString(response.getBody(), StandardCharsets.UTF_8.name());
		response.getStatusText();

		throw new EPrescriptionRestTemplateException(responseBody);
	}

}
