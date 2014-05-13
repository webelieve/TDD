package com.we.code.tdd.reverse;

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
