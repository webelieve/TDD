package com.we.code.tdd.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calculator;
	
	@Before
	public void setUp() {
		calculator = new StringCalculator();
    }
	
/*	Given/Then/When style!
    @Test
	public void emptyStringShouldReturnZero() {
		givenAnEmptyString();
		thenExecuteStringCalcualtor();
		verifyZeroReturned();
	}
	
	private String givenAnEmptyString() {
		return "";		
	}

	private int thenExecuteStringCalcualtor() {
		return calculator.add(givenAnEmptyString());		
	}

	private void verifyZeroReturned() {
		assertEquals(0, thenExecuteStringCalcualtor());		
	}*/

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
	
	@Test
	public void testNewlinesInString() {
		String numbers = "1\n2,3";
		int result = calculator.add(numbers);
		assertEquals(6, result);
	}
	
	@Test
	public void testAllDelimiters() {
		String numbers = " 1\n2,|3,%^ *0#";
		int result = calculator.add(numbers);
		assertEquals(6, result);
	}

}