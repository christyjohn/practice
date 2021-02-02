package com.practicalunittesting.chp03.testfixture;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Address> addresses = new ArrayList<>();
	
	public Client(Address addressA) {
		
	}
	
	public Client() {
		
	}
	
	public void addAddress(Address address) {
		addresses.add(address);
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
}
