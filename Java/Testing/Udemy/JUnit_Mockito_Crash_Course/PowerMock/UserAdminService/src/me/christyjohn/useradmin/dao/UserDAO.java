package me.christyjohn.useradmin.dao;

import me.christyjohn.useradmin.dto.User;
import me.christyjohn.useradmin.util.IDGenerator;

public class UserDAO {

	public int create(User user) {
		int id = IDGenerator.generateID();
		// save the user object to database
		return id;
	}
}
