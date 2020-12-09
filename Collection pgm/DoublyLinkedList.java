package com.uttara.CollectionLab;
public class DoublyLinkedList implements MyLinkedList {
	public Node head;
	public Node last;
	public long size;
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
	}
		public boolean add(Object o) {
			Node n = new Node(o);
			if(head==null && last==null)
			{ 
				head=last=n;
				size++;
				return true;
			}
			else {
				last.setNext(n);
				n.setPrevious(last);
				last = n;
				size++;
				return true;
			}
		}
		@Override
		public Object remove(int pos) {
			Node temp = head;
			Object removeData = null;

			if(pos==0) {
				removeData = head.getData();
				head.getNext().setPrevious(null);
				head = head.getNext();
				return removeData;
			}
			else if(pos==size-1) {
				for(int i = 0; i<pos; i++)
					temp = temp.getNext();
				removeData = temp.getData();
				temp.getPrevious().setNext(null);
				last = temp.getPrevious();
				return removeData;

			}
			else {
				for(int i = 0; i<pos; i++)
					temp = temp.getNext();
				removeData = temp.getData();
				temp.getNext().setPrevious(temp.getPrevious());
				temp.getPrevious().setNext(temp.getNext());
				return removeData;
			}
		}
		@Override
		public boolean remove(Object o) {
			Node temp = head;
			if(head.getData().equals(o)) {
				head.getNext().setPrevious(null);
				head = head.getNext();
				return true;
			}
			else if(last.getData().equals(o)) {
				last.setNext(null);
				last = last.getPrevious();
				return true;
			}
			else
				while(temp!=null) {
					temp = temp.getNext();
					if(temp.getData().equals(o)) {
						temp.getPrevious().setNext(temp.getNext());
						temp.getNext().setPrevious(temp.getNext());
						return true;
					}
					return false;

				}
			return false;

		}
		@Override
		public boolean insert(int pos, Object o) {
			Node n = new Node(o);
			Node temp = head;
			if(pos==0) {
				head.setPrevious(n);
				n.setNext(head);
				head = n;
				size++;
				return true;
			}
			else if(pos==size-1) {
				last.setNext(n);
				n.setPrevious(last);
				last=n;
				size++;
				return true;
			}
			else {
				for(int i = 0; i<pos-1; i++)
					temp = temp.getNext();
					n.setNext(temp.getNext());
					n.setPrevious(temp);
					temp.getNext().setPrevious(n);
					temp.setNext(n);
					size++;
					return true;
			}
		}
		@Override
		public Object get(int pos) {
			Node temp = head;
			if(pos==0)
				return head.getData();
			else {
			for(int i = 0; i<pos; i++)
				temp = temp.getNext();
			return temp.getData();
			}
		}
		@Override
		public long size() {
			return size;
		}
		@Override
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
				return false;
			}

			
		}
		@Override
		public boolean isEmpty() {
			if (size==0)
				return true;
			else
				return false;
		}
		@Override
		public void print() {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
			
		}

	}

