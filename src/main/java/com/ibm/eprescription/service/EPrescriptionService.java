package com.ibm.eprescription.service;

import com.ibm.eprescription.model.P003_Message;
import com.ibm.eprescription.model.P004_Message;
import com.ibm.eprescription.model.P005_Message;
import com.ibm.eprescription.model.P006_Message;

public interface EPrescriptionService {

	P004_Message searchForEPrescriptions(P003_Message searchCriteria);

	P004_Message dummySearchForEPrescriptions();

	P004_Message searchForEPrescriptions();

	P006_Message dispenseMedicalPrescription(P005_Message prescription);

}