package com.ibm.eprescription.restclient.exception;

import com.ibm.eprescription.model.EPrescriptionErrorMessage;

public class EPrescriptionResponseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EPrescriptionErrorMessage errorMessage;

	public EPrescriptionResponseException() {
		super();
	}

	public EPrescriptionResponseException(EPrescriptionErrorMessage errorMessage) {
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
