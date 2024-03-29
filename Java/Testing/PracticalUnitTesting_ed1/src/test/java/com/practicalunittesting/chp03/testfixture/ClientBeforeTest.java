package com.practicalunittesting.chp03.testfixture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ClientBeforeTest {
	private Address addressA = new Address("street A");
	private Address addressB = new Address("street B");
	private Client client = new Client();
	
	@Before
	public void setUp() {
		client = new Client();
	}
	
	@Test
	public void afterCreationShouldHaveNoAddress() {
		Client client = new Client();
		assertEquals(0, client.getAddresses().size());
	}
	
	@Test
	public void shouldAllowToAddAddress() {		
		client.addAddress(addressA);
		
		assertEquals(1, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
	}
	
	@Test
	public void shouldAllowToAddManyAddresses() {		
		client.addAddress(addressA);
		client.addAddress(addressB);
		
		assertEquals(2, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));
	}
}
