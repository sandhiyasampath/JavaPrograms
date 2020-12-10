package com.uttara.CollectionLab;

public class LinkedListHasACycle {

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		LinkedListHasACycle l = new LinkedListHasACycle();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		System.out.println(l.isCyclic(s));
		
	}
	public boolean isCyclic(SinglyLinkedList s) {
		if(s.getSize()==0)
			throw new IndexOutOfBoundsException("first create a list with element");
		else if(s.getSize()==1)
			return false;
		else {
			Node slow = s.getHead();
			Node fast = s.getHead();
			while(slow != null && fast.getNext() !=null && fast.getNext().getNext() != null) {
				slow = slow.getNext();
				fast = fast.getNext();
				if(slow==fast)
					return true;
			}
			return false;
		}
	}
	
}
