package com.ibm.eprescription.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.http.HttpStatus;

import com.ibm.eprescription.model.p099.P099_MessageBase;

@XmlRootElement(name = "message", namespace = "https://www.his.bg")
public class P099_Message extends P099_MessageBase {

	private HttpStatus httpStatus;
	private String errorMessage;

	public P099_Message() {
		super();
	}

	public P099_Message(HttpStatus httpStatus) {
		super();
		this.httpStatus = httpStatus;
	}

	public P099_Message(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public P099_Message(HttpStatus httpStatus, String errorMessage) {
		super();
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
