package com.ibm.eprescription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.ibm.eprescription.audit.EPrescriptionAuditLogger;
import com.ibm.eprescription.model.P004_Message;
import com.ibm.eprescription.model.P005_Message;
import com.ibm.eprescription.model.P006_Message;
import com.ibm.eprescription.service.EPrescriptionService;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	private EPrescriptionService ePrescriptionService;

	@Autowired
	private EPrescriptionAuditLogger ePrescriptionAuditLogger;

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		P004_Message searchMessage = ePrescriptionService.searchForEPrescriptions();
		System.out.println("P004_Message: " + searchMessage.toString());

		ePrescriptionAuditLogger.logEPrescriptionMessage(searchMessage);

		P006_Message dispenseMessage = ePrescriptionService.dispenseMedicalPrescription(new P005_Message());
		System.out.println("P006_Message: " + dispenseMessage.toString());

		return null;

	}

}