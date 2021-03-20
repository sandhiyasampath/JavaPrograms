package com.uttara.lists;

public class TestLists {

	public static void main(String[] args) {
		
		LinkedList<String> l1 = new SinglyLinkedList<String>();
		l1.add("howda");
		l1.add("henge");
		l1.add("super");
		l1.add("hoohaa");
		l1.add("abbha");
		
		l1.insert(0, "ulti");
		l1.insert(1, "bombastic");
		l1.add("chennagide");
		l1.insert(2,"chamak");
		
		l1.print();
		System.out.println("deleteing.......");
		l1.delete("chamak");
		
		l1.print();
		System.out.println("print reverse.....");
		l1.printReverse();
		System.out.println("reversing......");
		l1.print();
		//l1.reverse();
		l1.reverseRec();
		l1.print();
		
		System.out.println("middle = "+l1.findMiddle());

	}

}
