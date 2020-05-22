package com.christy.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.christy.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages()  {
		Message m1 = new Message(1L, "Hello, World!", "Christy");
		Message m2 = new Message(2L, "Welcome to REST apis", "Cecil");
		Message m3 = new Message(3L, "Welcome to Jersey", "Cecil");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
	
		return list;
	}
}
