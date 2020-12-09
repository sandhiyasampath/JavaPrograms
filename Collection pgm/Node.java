package com.uttara.CollectionLab;

public class Node {
	private Object data;
	private long position;
	private Node next;
	private Node previous;
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node() {
	}
	public Node(Object data) {
		this.data = data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getData()
	{
		return data;
	}
	public void setNext(Node n)
	{
		this.next = n;
	}
	public Node getNext()
	{
		return next;
	}
	public void setPosition(long l)
	{
		this.position = l;
	}
	public long getPosition()
	{
		return position;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
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
	
}
