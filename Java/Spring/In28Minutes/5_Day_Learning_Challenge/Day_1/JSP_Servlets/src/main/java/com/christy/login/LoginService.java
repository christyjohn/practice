package com.christy.login;

public class LoginService {
	public boolean isUserValid(String user, String password) {
		if (user.equals("christy") && password.equals("star"))
			return true;

		return false;
	}
}
