package com.christy.recursion;

public class CheckIfPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome("malayalam", 0, 8));
		System.out.println(isPalindrome("malayali", 0, 7));
	}
	
	static boolean isPalindrome(String word, int start, int end) {
		if (word.length() == 1)
			return true;
				
		char startChar = word.charAt(start);
		char endChar = word.charAt(end);
		
		if (startChar != endChar)
			return false;
		
		if (start < end)
			return  isPalindrome(word, ++start, --end);
		
		return true;
	}
}
