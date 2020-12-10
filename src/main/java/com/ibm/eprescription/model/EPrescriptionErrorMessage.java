package com.ibm.eprescription.model;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.ibm.eprescription.model.p099.Error;

public class EPrescriptionErrorMessage {

	private HttpStatus httpStatus;

	private String errorMessage;

	private List<Error> error;

	public EPrescriptionErrorMessage() {
	}

	public EPrescriptionErrorMessage(final HttpStatus httpStatus, final String errorMessage, final List<Error> error) {
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
		this.error = error;
	}

	public EPrescriptionErrorMessage(final HttpStatus httpStatus, final String errorMessage) {
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
	}

	public EPrescriptionErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public EPrescriptionErrorMessage(final HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(final HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<Error> getError() {
		return error;
	}

	public void setError(final List<Error> error) {
		this.error = error;
	}

}
