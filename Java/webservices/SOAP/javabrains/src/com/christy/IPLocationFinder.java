package com.christy;

public class IPLocationFinder {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You need to pass in one IP address.");
		} else {
			String ipAddress = args[0];
		}
	}
}