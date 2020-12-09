package com.uttara.CollectionLab;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList();
		s.add("sandhiya");
		s.add("abhinaya");
		s.add("abirami");
		s.add("sampath");
		s.add("sundari");
		s.add("sandhiya");
		s.insert(3,"sandhiya");
		System.out.println(s.get(1));
		System.out.println(s.contains("sampath"));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.insert(1,"inserted");
		s.insert(0,"first elment");
		System.out.println(s.remove(2));
		System.out.println(s.remove("sandhiya"));
		s.print();






	}
}
