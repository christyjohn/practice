package com.christy;

public class InvalidInputException extends Exception {

	private static final long serialVersionUID = 3172354295090719812L;
	
	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetials) {
		super(reason);
		this.errorDetails = errorDetials;
	}

	public String getFaultInfo() {
		return errorDetails;
	}
}
