package com.we.code.tdd.palindrome.integer;

public class PalindromeInteger {

	public boolean isPalindromeNumber(int number) {
		boolean isPalindromeNumber = false;	
		String numString = String.valueOf(number);
		
		if (numString.length() == 1) {
			return true;
		}
			
		char [] charString = numString.toCharArray();
		int length = charString.length;
						
		for(int i = 0; i < charString.length; i++) {
			if(charString[i] == charString[length-1]) {
				isPalindromeNumber = true;
			}
		}
		return isPalindromeNumber;
	}

}
