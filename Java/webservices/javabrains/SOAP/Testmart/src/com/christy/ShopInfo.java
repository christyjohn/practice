package com.christy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName="lookUpInput") String property) 
			throws InvalidInputException {
		String response = "Invalid property";
		
		if ("shopName".equals(property)) {
			response = "Test Mart";
		} else if ("since".equals(property)) {
			response = "since 2012";
		} else {
			throw new InvalidInputException("Invalid Input", property + 
					" is not a valid input ");
		}
		return response;
	}
}
