package com.uttara.CollectionLab;

public class MiddleElementOfLinkedListWithoutUsingSize {

	public MiddleElementOfLinkedListWithoutUsingSize() {
	}

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		MiddleElementOfLinkedListWithoutUsingSize m = new MiddleElementOfLinkedListWithoutUsingSize();
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		s.add("six");
		s.add("seven");
		System.out.println(m.middleElement(s));

	}
	public Object middleElement(SinglyLinkedList l) {
		Node slow = l.getHead();
		Node fast = l.getHead();
		while(fast!=null && fast.getNext()!=null && slow!=null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();	
	}

}
