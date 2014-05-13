package com.we.code.tdd.longestchar;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LongestCharactersTest {
	
	private LongestCharacters longestChar;
	
	@Before
	public void setUp() {
		longestChar = new LongestCharacters();
	}
	
	@Test
	public void oneCharTest() {
		String words = new String("a");		
		int result = longestChar.lengthOfLongestSubstring(words);	        
	    assertEquals(1, result);
	}
	
	@Test
	public void twoCharsTest() {
		String words = new String("aba");
		int result = longestChar.lengthOfLongestSubstring(words);
		assertEquals(1, result);
	}

}
