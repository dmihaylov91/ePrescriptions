package com.ibm.eprescription.restclient.exception;

import com.ibm.eprescription.model.P099_Message;

public class EPrescriptionResponseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private P099_Message errorMessage;

	public EPrescriptionResponseException() {
		super();
	}

	public EPrescriptionResponseException(P099_Message errorMessage) {
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
