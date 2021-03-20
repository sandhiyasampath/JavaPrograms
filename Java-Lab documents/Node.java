package com.uttara.lists;

public class Node<T> {

	private T element;
	private Node next;
	private int position;
	
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	
	@Override
	public String toString() {
		return "Node [element=" + element + ", next=" + next + ", position="
				+ position + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((element == null) ? 0 : element.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + position;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (element == null) {
			if (other.element != null)
				return false;
		} else if (!element.equals(other.element))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (position != other.position)
			return false;
		return true;
	}
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(T element) {
		super();
		this.element = element;
	}
	public Node(T element, int position) {
		super();
		this.element = element;
		this.position = position;
	}
	
	
}
