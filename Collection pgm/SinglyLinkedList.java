package com.uttara.CollectionLab;

public class SinglyLinkedList implements MyLinkedList {
	private long size;
	private Node head;
	private Node last;

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	public boolean add(Object o) {
		Node n = new Node(o);
		if(size==0 && head==null && last==null) {
			head=last=n;
			size++;
			return true;
		}
		else {
			last.setNext(n);
			last=n;
			size++;
			return true;
		}
	}
	public Object remove(int pos) {
		Node temp = head;
		if(pos==0) {
			Object o = head.getData();
			head = head.getNext();
			reposition();
			return o;
		}
		else if(pos==size-1) {
			for(int i = 0; i<pos-1; i++)		
				temp = temp.getNext();
			temp.setNext(null);
			last = temp;
			reposition();
			return temp.getData();
	
		}
		else {
			for(int i = 0; i<pos-1; i++)		
				temp = temp.getNext();
			Node remove = temp.getNext();
			temp.setNext(temp.getNext().getNext());
			reposition();
			remove.setNext(null);
			return temp.getNext().getData();
		}
	}
		//remove by element
		public boolean remove(Object o) {
			Node previous;
			Node temp = head;
			if(head==null) 
				return false;
			else if(head.getData().equals(o)) {
				head = head.getNext();
				return true;
			}
			else {
				while(temp!=null) {
					previous = temp;
					temp = temp.getNext();
					if(temp.getData().equals(o)) {
						previous.setNext(previous.getNext().getNext());
					}
					reposition();
					return true;
				}
				return false;
			}
			
		}
		
	public boolean insert(int pos,Object o) {
		Node n = new Node(o);
		Node temp = head;
		if(pos==0) {
			n.setNext(head);
			head=n;
			reposition();
			return true;
		}
		else {
			for(int i=0; i<pos-1; i++)
				temp = temp.getNext();
			n.setNext(temp.getNext());
			temp.setNext(n);
			size++;
			reposition();
			return true;
		}
	}
	public Object get(int pos) {
		Node temp = head;
		for(int i = 0; i<pos; i++)
			temp = temp.getNext();
		return temp.getData();
		
	}
	public long size() {
		return size;
		
	}
	public boolean contains(Object o) {
		Node temp = head;
		if(head==null)
			return false;
		else {
		while(temp!=null) {
			if(temp.getData().equals(o))
				return true;
			temp = temp.getNext();
		}
		}
		return false;
	}
	public boolean isEmpty() {
		if(size==0)
			return true;
		else
			return false;
	}
	public void print() {
		Node temp = head;
		while(temp.getNext()!=null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	private void reposition() {
		Node temp = head;
		long i=0;
		if(head==null)
			return;
		else {
			while(temp!=null) {
				temp.setPosition(i++);
				temp = temp.getNext();
			}
		}
	}
	public void clear() {
		head = last = null;
		size = 0;
	}
}
