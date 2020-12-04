package com.ibm.eprescription.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.eprescription.model.P003_Message;
import com.ibm.eprescription.model.P004_Message;
import com.ibm.eprescription.model.P005_Message;
import com.ibm.eprescription.model.P006_Message;
import com.ibm.eprescription.restclient.dispense.EPrescriptionDispenseRestClient;
import com.ibm.eprescription.restclient.search.EPrescriptionSearchRestClient;
import com.ibm.eprescription.service.EPrescriptionService;

@Service
public class EPrescriptionServiceImpl implements EPrescriptionService {

	@Autowired
	private EPrescriptionSearchRestClient ePrescriptionSearchRestClient;
	@Autowired
	private EPrescriptionDispenseRestClient ePrescriptionDispenseRestClient;

	@Override
	public P004_Message searchForEPrescriptions(final P003_Message searchCriteria) {
		return ePrescriptionSearchRestClient.searchForEPrescriptions(searchCriteria);
	}

	@Override
	public P004_Message dummySearchForEPrescriptions() {
		return ePrescriptionSearchRestClient.dummySearchForEPrescriptions();
	}

	@Override
	public P004_Message searchForEPrescriptions() {
		return ePrescriptionSearchRestClient.searchForEPrescriptions();
	}

	@Override
	public P006_Message dispenseMedicalPrescription(P005_Message prescription) {
		return ePrescriptionDispenseRestClient.dispenseMedicalPrescription(prescription);
	}

}
