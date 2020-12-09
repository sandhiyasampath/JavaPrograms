package com.uttara.CollectionLab;

public interface MyLinkedList {
	public boolean add(Object o);
	public Object remove(int pos);
	public boolean remove(Object o);
	public boolean insert(int pos,Object o);
	public Object get(int pos);
	public long size();
	public boolean contains(Object o);
	public boolean isEmpty();
	public void print();

}
