package com.ibm.eprescription.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.ibm.eprescription.model.p006.P006_MessageBase;

@XmlRootElement(name = "message", namespace = "https://www.his.bg")
public class P006_Message extends P006_MessageBase {

	private EPrescriptionErrorMessage errorMessage;

	public P006_Message() {
		super();
	}

	public P006_Message(EPrescriptionErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public EPrescriptionErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(EPrescriptionErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

}
