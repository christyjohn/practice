package com.christy;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if (args.length < 1)
			System.out.println("You need to pass in a one IP address");
		else {
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIpService = ipService.getGeoIPServiceSoap();
			String country = geoIpService.getIpLocation(ipAddress);
			System.out.println("Country: " + country);
		}
	}

}
