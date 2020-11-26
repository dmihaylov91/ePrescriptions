package com.ibm.eprescription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.ibm.eprescription.restclient.search.EPrescriptionSearchRestClient;
import com.ibm.eprescription.restclient.search.impl.EPrescriptionSearchRestClientImpl;


@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private EPrescriptionSearchRestClientImpl ePrescriptionSearchRestClient;
	
	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		
		return builder.build();
	}
	


	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			
			ePrescriptionSearchRestClient.dummySearchForEPrescriptions();
			
		};
	}
	
	


}