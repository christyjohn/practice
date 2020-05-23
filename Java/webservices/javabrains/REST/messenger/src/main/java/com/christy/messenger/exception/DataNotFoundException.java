package com.christy.messenger.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -23468234898789342L;
	
	public DataNotFoundException(String message) {
		super(message);
	}
}
