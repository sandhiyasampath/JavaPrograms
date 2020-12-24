package com.uttara.CollectionLab;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		s.add("one");
		s.insert(1,"two");
		System.out.println(s.get(1));
		System.out.println(s.contains("one"));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.insert(1,"three");
		s.insert(0,"zero");
		System.out.println(s.remove(1));
		System.out.println(s.remove("two"));

	}
}
