package com.ibm.eprescription.restclient.exception;

public class EPrescriptionRestTemplateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EPrescriptionRestTemplateException() {
		super();
	}

	public EPrescriptionRestTemplateException(String message) {
		super(message);
	}

	public EPrescriptionRestTemplateException(String message, Throwable cause) {
		super(message, cause);
	}

}
