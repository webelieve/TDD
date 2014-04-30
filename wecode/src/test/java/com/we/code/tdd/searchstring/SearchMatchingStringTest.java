package com.we.code.tdd.searchstring;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SearchMatchingStringTest {
	
	private SearchMatchingStrings matchString;
	
	@Before
	public void setUp() {
		matchString = new SearchMatchingStrings();
		
	}
	
	@Test
	public void foundMatchTest() {
		List<String> stringsToSearch = new ArrayList<String>();
		stringsToSearch.add("Value Date");
		stringsToSearch.add("Schedule Date");
		stringsToSearch.add("Date");
		stringsToSearch.add("Transaction Amount");
		stringsToSearch.add("Code");
		stringsToSearch.add("Beneficiary pre-approved currency");
		
	    List<String> searchToMatch = new ArrayList<String>();
	    searchToMatch.add("Value Date should not be before today's date.");
	    searchToMatch.add("Schedule Date is required.");
	    searchToMatch.add("Date is required.");
		
		matchString.process(stringsToSearch, searchToMatch);
		
	}

}
