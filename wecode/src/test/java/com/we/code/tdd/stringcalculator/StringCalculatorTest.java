package com.we.code.tdd.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calculator;
	private String numbers;
	private int sum;
	
	@Before
	public void setUp() {
		calculator = new StringCalculator();
    }
	
	@Test
	public void emptyStringShouldReturnZero() {
		givenAnEmptyString();
		thenExecuteStringCalcualtor();
		verifyZeroReturned();
	}
	
	private void givenAnEmptyString() {
		numbers = null;		
	}

	private void thenExecuteStringCalcualtor() {
		sum = calculator.add(numbers);		
	}

	private void verifyZeroReturned() {
		assertEquals(0, sum);		
	}

	@Test
	public void shouldReturnZeroOnEmptyString() {
		String s = new String("");
		int result = calculator.add(s);		
		assertEquals(0, result);
	}
	
	@Test
	public void shouldReturnItselfWhenOnlyOneDigitNumber() {
		String s = new String("1");
		int result = calculator.add(s);
		assertEquals(Integer.parseInt(s), result);
	}
	
	@Test
	public void shouldSumWhenMoreThanOneNumber() {
		String s = new String("1,2");
		int result = calculator.add(s);
		assertEquals(3, result);
	}

}
