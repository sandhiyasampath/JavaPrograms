package com.uttara.lists;

public class SinglyLinkedList<T> implements LinkedList<T> {

	private Node head;
	private int size;
	
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public void add(T ele) {
		Node n = new Node(ele,size);
		size++;
		if(head == null)
			head = n;
		else
		{
			Node temp = head;
			while(temp.getNext()!=null)
				temp=temp.getNext();
			
			temp.setNext(n);
		}

	}

	@Override
	public void insert(int pos, T ele) {
		if(pos < 0 || pos > size)
		{
			System.out.println("Provide proper position to add element");
			return;
		}
		
		Node n = new Node(ele,pos);
		Node temp = head;
		if(pos==0)
		{
			n.setNext(head);
			head = n;
			
		}
		else
		{
			while(temp.getPosition()!=pos-1)
			{
				temp=temp.getNext();
			}
			n.setNext(temp.getNext().getNext());
			temp.setNext(n);
		}
		reposition();
	}
	
	public void reposition()
	{
		Node temp=head;
		int p=0;
		while(temp!=null)
		{
			temp.setPosition(p++);
			temp=temp.getNext();
		}
	}

	@Override
	public void delete(T ele) {

		if(head==null)
			System.out.println("List is empty to delete");
		else
		{
			Node temp = head;
			if(temp.getElement().equals(ele))
			{
				head = head.getNext();
				temp.setNext(null);
				reposition();
			}
			else
			while(temp.getNext()!=null)
			{
				if(temp.getNext().getElement().equals(ele))
				{
					Node t = temp.getNext();
					temp.setNext(temp.getNext().getNext());
					t.setNext(null);
					reposition();
					return;
				}
				temp=temp.getNext();	
			}
				
		}
	}

	@Override
	public boolean isEmpty() {
		return (head==null);
	}

	@Override
	public void print() {
		if(head==null)
			System.out.println("Empty List");
		
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.getElement()+" at "+temp.getPosition());
			temp=temp.getNext();
		}
		
	}

	@Override
	public void printReverse() {
		if(head!=null)
			printRev(head);
	}

	public void printRev(Node t)
	{
		if(t.getNext()!=null)
		{
			printRev(t.getNext());
			System.out.println(t.getElement()+" pos = "+t.getPosition());
		}
	}
	
	@Override
	public void reverse() {
		Node prev=null;
		Node current = head;
		while(current!=null)
		{
			Node t = current.getNext();
			current.setNext(prev);
			prev = current;
			current = t;	
		}
		head = prev;
		reposition();
	}

	@Override
	public void reverseRec() {
		Node prev = null;
		reverseRec(prev,head);
	}

	private void reverseRec(Node prev, Node current) {
		
		if(current==null)
		{
			head = prev;
			return;
		}
		Node temp = current.getNext();
		current.setNext(prev);
		reverseRec(current, temp);
	}
	@Override
	public boolean isCyclic() {
		Node slowR = head;
		Node fastR = head;
		
		while(fastR!=null && fastR.getNext()!=null)
		{
			slowR = slowR.getNext();
			fastR = fastR.getNext().getNext();
			if(slowR==fastR)
				return true;
		}
		return false;
	}

	@Override
	public T findMiddle() {
		
		if (head == null) {
			return null;
		}
		Node slow, fast;
		slow = fast = head;
		while (fast!= null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return (T) slow.getElement();
	}

}
