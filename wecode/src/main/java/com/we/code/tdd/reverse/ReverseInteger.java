package com.we.code.tdd.reverse;

/*
 * ere are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then 
the reverse of 1000000003 overflows. How should you handle such cases?

Throw an exception? Good, but what if throwing an exception is not an option? You would then have to re-design the function 
(ie, add an extra parameter).
 */
public class ReverseInteger {

	public int reverse(int number) {

		String num = String.valueOf(number);

		if (num.length() == 1) {
			return number;
		}

		int length = num.length();
		char[] reversed = new char[length];

		if (num.charAt(0) == '-') {
			reversed[0] = '-';
			for (int i = 1; i < length; i++) {
				reversed[i] = num.charAt(length - i);
			}
		} else {

			for (int i = 0; i < length; i++) {
				reversed[i] = num.charAt((length - 1) - i);
			}
		}

		long result = Long.parseLong(new String(reversed));
		int intResult = 0;
				
		if (result > Integer.MAX_VALUE) {
			intResult = Integer.MAX_VALUE;
		}

		return intResult;
	}

}
