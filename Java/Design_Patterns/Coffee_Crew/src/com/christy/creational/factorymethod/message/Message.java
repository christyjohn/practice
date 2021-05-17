package com.christy.creational.factorymethod.message;

public abstract class Message {
	
	public abstract String getContent();
	
	public void addDefaultHeaders() {
		// adds some default headers
	}
	
	public void encrypt() {
		// has some code to encrypt the content
	}
	
}
