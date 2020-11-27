package com.ibm.eprescription.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.ibm.eprescription.restclient.search.impl.EPrescriptionSearchRestClientImpl;

@Configuration
public class EPrescriptionConfig {

	@Bean
	public ClientHttpRequestFactory clientHttpRequestFactory() {
		final HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();

		factory.setReadTimeout(3000);
		factory.setConnectTimeout(3000);
		factory.setConnectionRequestTimeout(3000);

		return factory;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder, ClientHttpRequestFactory clientHttpRequestFactory) {

		RestTemplate restTemplate = builder.build();
		restTemplate.setRequestFactory(clientHttpRequestFactory);

		return restTemplate;
	}

	@Bean
	public EPrescriptionSearchRestClientImpl ePrescriptionSearchRestClient(RestTemplate restTemplate) {

		EPrescriptionSearchRestClientImpl ePrescriptionSearchRestClient = new EPrescriptionSearchRestClientImpl();
		ePrescriptionSearchRestClient.setRestTemplate(restTemplate);
		ePrescriptionSearchRestClient.setApiEndPoint("https://ptest-api.his.bg");
		ePrescriptionSearchRestClient.setUri("/v1/ereferral/pharmacy/fetch");

		return ePrescriptionSearchRestClient;
	}

}
