package com.practicalunittesting.chp03.exercises;

import java.util.ArrayList;
import java.util.List;

public class StringReverseApp {

	public static String reverse(String s) {
		if (s.equals(null)) {
			throw new NullPointerException("Null String");
		}
		
		List<String> tempArray = new ArrayList<String>(s.length());
		for (int i = 0; i < s.length(); i++) {
			tempArray.add(s.substring(i, i+1));
		}
		StringBuilder reversedString = new StringBuilder(s.length());
		for (int i = tempArray.size() -1; i >= 0; i--) {
			reversedString.append(tempArray.get(i));
		}
		return reversedString.toString();
	}
}
