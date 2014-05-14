package com.we.code.tdd.convert;

/**
 * 1. Start number at 0
 * 
 * 2. If the first character is '-' 
 *    Set the negative flag 
 *    Start scanning with the next character 
 *    For each character in the string Multiply number by 10
 *          Add( digit number - '0' ) to number 
 *    If negative flag 
 *       set Negate number
 *    Return number
 * 
 * 
 */
public class StringToInteger {

	public int atoi(String string) {

		if(string == null || string.isEmpty()) {
			return 0;
		}
		
		int i = 0, number = 0;
		boolean isNegative = false;
		boolean isPositive = false;
		int len = string.length();
		
		if (string.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		else if (string.charAt(0) == '+') {
			isPositive = true;
			i = 1;
		}
		
		while (i < len) {
			number *= 10;
			number += (string.charAt(i++) - '0');
			//TODO:
			/*if (number > Character.MAX_VALUE) {
				continue;
			}*/
		}
		
		if (isNegative) {
			number = -number;
		}
		else if (isPositive) {
			number = +number;
		}
		
		return number;
	}

}
