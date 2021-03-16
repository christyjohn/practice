package com.christy.solid.srp;

public class UserPersistenceService {

	private Store store = new Store();
	
	public void saveUser(User user) {
		store.store(user);
	}
}
