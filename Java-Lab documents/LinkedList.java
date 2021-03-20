package com.uttara.lists;

public interface LinkedList<T> {

	public void add(T ele);
	public void insert(int pos, T ele);
	public void delete(T ele);
	public boolean isEmpty();
	public void print();
	public void printReverse();
	public void reverse();
	public void reverseRec();
	public boolean isCyclic();
	public T findMiddle();
	public int getSize();
}
