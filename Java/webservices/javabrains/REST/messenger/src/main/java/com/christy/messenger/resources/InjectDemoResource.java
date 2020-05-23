package com.christy.messenger.resources;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.Path;

@Path("/injectdemo")
public class InjectDemoResource {
	
	@GET
	@Path("annotations")
	public String getParamUsingAnnotations(@MatrixParam("param") String matrixParam,
										   @HeaderParam("customHeaderValue") String header,
										   @CookieParam("name") String cookie) {
		return "Matrix param: " + matrixParam + 
			    ", Header param: " + header +
			    ", Cookie param: " + cookie;
	}
}
