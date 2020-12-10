package com.uttara.CollectionLab;

import java.util.EmptyStackException;

public class ReverseLinkedList {
	Node top;
	int size;
	
	public static void main(String[] args) {
		
		ReverseLinkedList r = new ReverseLinkedList();
		r.push("one");
		r.push("two");
		r.push("three");
		r.push("four");
		System.out.println(r.pop());
		System.out.println(r.pop());
		System.out.println(r.pop());
		System.out.println(r.pop());
	}
	public void push(Object o) {
		Node n = new Node(o);
		if(top==null)
			top = n;
		else {
			n.setNext(top);
			top = n;
		}
		size++;
	}
	public Object pop() {
		if(top==null)
			throw new EmptyStackException();
		else {
			Node temp = top;
			top =top.getNext();
			temp.setNext(null);
			return temp.getData();
		}
		
	}
	public Object peek() {
		return top.getData();
	}

 

}
