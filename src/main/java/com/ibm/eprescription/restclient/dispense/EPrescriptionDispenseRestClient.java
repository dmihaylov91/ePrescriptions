package com.ibm.eprescription.restclient.dispense;

import com.ibm.eprescription.model.P005_Message;
import com.ibm.eprescription.model.P006_Message;

public interface EPrescriptionDispenseRestClient {

	P006_Message dispenseMedicalPrescription(P005_Message prescription);

}