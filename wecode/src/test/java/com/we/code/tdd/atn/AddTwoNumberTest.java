package com.we.code.tdd.atn;

import org.junit.Before;
import org.junit.Test;

import com.we.code.tdd.atn.ListNode;

public class AddTwoNumberTest {
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void singleDigitNumbersTest() {
		// 123
		ListNode node3 = new ListNode(1, null);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(3, node2);
		
		//456
		ListNode node6 = new ListNode(4, null);
		ListNode node5 = new ListNode(5, node6);
		ListNode node4 = new ListNode(6, node5);
		
		
		Solution solution = new Solution();
		
		ListNode result = solution.addTwoNumbers(node1, node4);
	}

}
