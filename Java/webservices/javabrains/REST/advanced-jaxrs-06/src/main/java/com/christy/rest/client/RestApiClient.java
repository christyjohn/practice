package com.christy.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.christy.messenger.model.Message;

public class RestApiClient {
	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient();
		/*
		// what exactly is the code
		WebTarget target = client.target("http://localhost:8080/advanced-jaxrs-06/webapi/messages/1");
		Builder builder = target.request(MediaType.APPLICATION_JSON);
		Response response = builder.get();
		Message message = response.readEntity(Message.class);
		*/
		
		WebTarget baseTarget = client.target("http://localhost:8080/advanced-jaxrs-06/webapi/");
		WebTarget messagesTarget = baseTarget.path("messages");
		WebTarget singleMessageTarget = messagesTarget.path("{messageId}");
		
		/*
		Message message = client
				.target("http://localhost:8080/advanced-jaxrs-06/webapi/messages/1")
				.request()
				.get(Message.class);
		*/
		Message message1 = singleMessageTarget
				.resolveTemplate("messageId", "1")
				.request(MediaType.APPLICATION_JSON)
				.get(Message.class);
		System.out.println(message1.getMessage());
		
		Message message2 = singleMessageTarget
				.resolveTemplate("messageId", "2")
				.request(MediaType.APPLICATION_JSON)
				.get(Message.class);
		System.out.println(message2.getMessage());
	}
}
