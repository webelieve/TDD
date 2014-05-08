package com.we.code.tdd.stringcalculator;

public class StringCalculator {

	public int add(String numbers) {
		if (numbers == null || "".equals(numbers)) {
			return 0;
		}
		
		String[] array = numbers.split("[^0-9]");
		
		int result = 0;
		
		for(String number : array) {
			if (number.isEmpty()) {
				continue;
			}
			result += Integer.parseInt(number);
		}
		
		return result;
	}

}
