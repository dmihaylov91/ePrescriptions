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
package com.ibm.eprescription.restclient.search;

import com.ibm.eprescription.model.P003_Message;
import com.ibm.eprescription.model.P004_Message;

/**
 * @author DimitarMihaylov
 */

public interface EPrescriptionSearchRestClient {
	P004_Message searchForEPrescriptions(final P003_Message searchCriteria);

	P004_Message dummySearchForEPrescriptions();

	P004_Message searchForEPrescriptions();
}
