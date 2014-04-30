package com.we.code.tdd.twosum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use hash map to store the difference between the target and the 
 * each number in the array, then you only look for the difference 
 * in the remaining array.
 * 
 * @author fong1988
 *
 */
public class Solution {
	
	public Integer[] twoSum(int[] numbers, int target) {
		List<Integer> indexes = new ArrayList<Integer>();
		Map<Integer, Integer> nextNumber = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {			
			if(nextNumber.containsKey(numbers[i])) {
				indexes.add(nextNumber.get(numbers[i]));	
				indexes.add(i+1);
				break;
			}
			nextNumber.put((target - numbers[i]), i+1);
		}
		return indexes.toArray(new Integer[indexes.size()]);
	}

}
