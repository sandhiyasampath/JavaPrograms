package com.uttara.CollectionLab;

public class TestDoublyLinkedList {

	public TestDoublyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		System.out.println(d.add("one"));
		System.out.println(d.add("two"));
		System.out.println(d.add("three"));
		System.out.println(d.insert(1,"four"));
		d.print();
		System.out.println(d.get(2));
	}

}
