package com.we.code.tdd.stringcalculator;

import com.we.code.tdd.stringcalculator.exception.NegativeNumberException;

public class StringCalculator {

	public int add(String numbers) {
		if(checkNullOrEmptyString(numbers)) {
			return 0;
		}

		String[] filteredNumbers = numbers.split("[^-&&\\D]");
		
		StringBuilder negativeNumbers = new StringBuilder();
		
		findNegativeNumbers(filteredNumbers, negativeNumbers);

		throwExceptionOnNegavtiveNumbers(negativeNumbers);

		return sumValidNumbers(filteredNumbers);
	}

	private boolean checkNullOrEmptyString(String numbers) {
		return (numbers == null || "".equals(numbers));
	}

	private void throwExceptionOnNegavtiveNumbers(StringBuilder negativeNumbers) {
		if (negativeNumbers.length() > 0) {
			throw new NegativeNumberException("Negative not allowed: "
					+ negativeNumbers.toString());
		}
	}

	private int sumValidNumbers(String[] filteredNumbers) {
		int result = 0;

		for (String number : filteredNumbers) {
			if(number.isEmpty()) {
				continue;
			}
			result += Integer.parseInt(number);
		}
		return result;
	}

	private void findNegativeNumbers(String[] filteredNumbers, StringBuilder negativeNumbers) {
		for (String number : filteredNumbers) {
			if(number.isEmpty()) {
				continue;
			}
			
			if (Integer.parseInt(number) < 0) {
				negativeNumbers.append(" | ");
				negativeNumbers.append(number);
				negativeNumbers.append(" | ");
			}

		}
	}

}
