package com.we.code.tdd.twosum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TwoSumTest2 {
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void emptyArrayTest() {
		int [] test = new int[]{};
		
		int target = 6;
		
		Solution2 solution = new Solution2();
				
		int [] result = solution.twoSum(test, target);
		
		assertEquals(0, result.length);		
		
	}
	
	@Test
	public void simpleTest() {
		int [] test = new int[]{3, 3};
		
		int target = 6;
		
		Solution2 solution = new Solution2();
				
		int [] result = solution.twoSum(test, target);
			
		assertArrayEquals(new int[]{1, 2}, result);
		
		
	}
	@Test
	public void arrayWithOneElementTest(){
		int [] test = new int[]{6};
		
		int target = 6;
		Solution2 solution = new Solution2();		
		
		int [] result = solution.twoSum(test, target);
		
		assertEquals(0, result.length);

	}

}
