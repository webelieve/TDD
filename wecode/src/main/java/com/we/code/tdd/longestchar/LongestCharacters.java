package com.we.code.tdd.longestchar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestCharacters {
	

	public int lengthOfLongestSubstring(String words) {
		if(words.length() == 1) {
			return 1;
		}
		
		Map<Integer, Set<Character>> wordMap = new HashMap<Integer, Set<Character>>();
		int key = 0;
		char pre = 0;
		Set<Character> values = null;
		
		for (char c : words.toCharArray()) {
			values = new HashSet<Character>();
			
            if ( c != pre) {
               values = new HashSet<Character>();    			
			   values.add(c);
			}
		
			key++;
			pre = c;
		}
	
	    wordMap.put(key, values);
		
		///testing
		for(Set<Character> set : wordMap.values()) {
			for(char c : set) {
			   System.out.print(c);
			}
		}
		return 0;
	}

}
