package com.we.code.tdd.palindrome.integer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromeIntegerTest {
	
	private PalindromeInteger palindrome;

	@Before
	public void setUp() {
		palindrome = new PalindromeInteger();
	}
	
	@Test
	public void testOneDigitNumber() {
		int number = 1;
		boolean result = palindrome.isPalindromeNumber(number);
		assertTrue(result);
	}
	
	@Test
	public void testTwoDigitNumber() {
		int number = 12;
		boolean result = palindrome.isPalindromeNumber(number);
		assertFalse(result);
	}

}
