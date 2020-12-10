package com.uttara.CollectionLab;

import java.util.Stack;

public class PrintLinkedListElementReverse {

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		PrintLinkedListElementReverse p = new PrintLinkedListElementReverse();
		Node temp = s.getHead();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		s.add("six");
		s.add("seven");
		s.add("----------------------------------------");

		p.reverseListUsingStack(s);
		p.reverseListUsingRecursion(s.getHead());

	}
	public void reverseListUsingStack(SinglyLinkedList s) {
		Stack stack = new Stack();
		Node temp = s.getHead();
		while(temp != null) {
			stack.push(temp.getData());
			temp = temp.getNext();
		}
		while(stack.isEmpty()!=true)
			System.out.println(stack.pop());
		
	}
	public void reverseListUsingRecursion(Node temp) {
		if(temp==null)
			return;
		else
			reverseListUsingRecursion(temp.getNext());
		System.out.println(temp.getData());
	}
}
