package com.ibm.eprescription.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.ibm.eprescription.restclient.exception.RestTemplateResponseErrorHandler;
import com.ibm.eprescription.restclient.search.impl.EPrescriptionSearchRestClientImpl;

@Configuration
@PropertySource("classpath:eprescription.properties")
public class EPrescriptionConfig {

	@Value("${eprescription.read.timeout}")
	int readTimeOut;

	@Value("${eprescription.connect.timeout}")
	int connectTimeOut;

	@Value("${eprescription.connection.request.timeout}")
	int connectionRequestTimeout;

	@Value("${eprescription.api.endpoint}")
	String apiEndPoint;

	@Value("${eprescription.search.uri}")
	String searchUri;

	@Bean
	public ClientHttpRequestFactory clientHttpRequestFactory() {
		final HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();

		factory.setReadTimeout(readTimeOut);
		factory.setConnectTimeout(connectTimeOut);
		factory.setConnectionRequestTimeout(connectionRequestTimeout);

		return factory;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder, ClientHttpRequestFactory clientHttpRequestFactory,
			RestTemplateResponseErrorHandler restTemplateResponseErrorHandler) {

		RestTemplate restTemplate = builder.build();
		restTemplate.setRequestFactory(clientHttpRequestFactory);
		restTemplate.setErrorHandler(restTemplateResponseErrorHandler);

		return restTemplate;
	}

	@Bean
	public EPrescriptionSearchRestClientImpl ePrescriptionSearchRestClient(RestTemplate restTemplate) {

		EPrescriptionSearchRestClientImpl ePrescriptionSearchRestClient = new EPrescriptionSearchRestClientImpl();
		ePrescriptionSearchRestClient.setRestTemplate(restTemplate);
		ePrescriptionSearchRestClient.setApiEndPoint(apiEndPoint);
		ePrescriptionSearchRestClient.setUri(searchUri);

		return ePrescriptionSearchRestClient;
	}

}
