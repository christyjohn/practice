package com.christy.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {
		
	@GET
	//@Produces(MediaType.TEXT_PLAIN)
	// our custom media type, to test remove TEXT_PLAIN
	// if multiple values are there Jersey will pick the apt one by default
	@Produces(value = { MediaType.TEXT_PLAIN, "text/shortdate" }) 
	public Date testMethod() {
		return Calendar.getInstance().getTime();
	}
}
