package com.we.code.tdd.searchstring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SearchMatchingStrings {
	
	public int matches(String stringToSearch, String stringToMatch) {
		Map<String, String> map = new HashMap<String, String>();
		
		String[] stringToMatchArray = stringToMatch.split(" ");
		for(String word : stringToMatchArray) {
			map.put(word, word);
		}
		
		String[] stringToSearchArray = stringToSearch.split(" ");
		int matchCounter = 0;
		for(String word : stringToSearchArray) {
		    if(map.containsKey(word)) {
		    	matchCounter++;
		    }
		}
			
		return matchCounter;
	}
	
	public void process(List<String> stringList, List<String> searchString) {
		String result = null;
		
		for(String s : searchString) {
			result = mostMatchedString(stringList, s);
			System.out.println(result);
		}
	}

	private String mostMatchedString(List<String> stringList, String searchString) {
		
		Map<Integer, String> matchWithScores = new HashMap<Integer, String>();
		
		for(String s : stringList) {
			int matches = matches(s, searchString);
			//System.out.println(matches + " => " + s);
			
            matchWithScores.put(matches, s);
		}
		
		TreeMap<Integer, String> sortedMap = new TreeMap<Integer, String>(matchWithScores);
		
		for(Entry entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
		
		return sortedMap.lastEntry().getValue();
	}

}
