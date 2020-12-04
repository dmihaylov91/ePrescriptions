package com.ibm.eprescription.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.ibm.eprescription.model.p006.P006_MessageBase;

@XmlRootElement(name = "message", namespace = "https://www.his.bg")
public class P006_Message extends P006_MessageBase {

	private P099_Message errorMessage;

	public P006_Message() {
		super();
	}

	public P006_Message(P099_Message errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public P099_Message getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(P099_Message errorMessage) {
		this.errorMessage = errorMessage;
	}

}
