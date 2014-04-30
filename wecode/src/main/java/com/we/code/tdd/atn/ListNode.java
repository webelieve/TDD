package com.we.code.tdd.atn;

public class ListNode {
	int value;
	ListNode next;
	
	ListNode(int value, ListNode node) {
		this.value = value;
		this.next = node;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}
