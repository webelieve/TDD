package com.we.code.tdd.stringcalculator;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers == null || "".equals(numbers)) {
			return 0;
		}
		
		String[] array = numbers.split(",");
		
		int result = 0;
		
		for(String number : array) {
			result += Integer.parseInt(number);
		}
		
		return result;
	}

}
