package com.uttara.CollectionLab;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
	private Object[] arr = new Object[10];
	private int count = 0;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyArrayList other = (MyArrayList) obj;
		if (!Arrays.deepEquals(arr, other.arr))
			return false;
		if (count != other.count)
			return false;
		return true;
	}
	public MyArrayList() {
	}

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("sandhiya");
		arr.add("sampath");
		arr.add("sundari");
		arr.add("abhinaya");
		arr.add("abirami");
		arr.add("thirkavan");
		arr.add("balaji");
		arr.add("ganapath");
		arr.add("sandhiya");
		arr.add("sandhiya");
		arr.add("sandhiya");
		arr.add("sandhiya");
		arr.remove("ganapath");
		arr.add(1,"palaniyandi");
		System.out.println(arr.contains("gana"));
		System.out.println(arr);
	}
	public boolean add(Object o)
	{
		if(count<arr.length)
		{
			arr[count] = o;
			count++;
			return true;
		}
		else
		{
			Object[] newarr = new Object[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i-1] = arr[i];
			}
			arr = newarr;
			arr[count] = o;
			count++;
			return true;
		}
		
	}
	public boolean remove(Object o)
	{
		for (int i = 0; i <= count; i++) {
			if(arr[i].equals(o))
			{
				for (int j = i; j < arr.length; j++) {
					arr[i] = arr[i+1];
				}
			}
		}
			arr[count]=null;
			count--;
			return true;
	}
	public boolean contains(Object o)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(o)) {
				return true;
			}
			else
				return false;
		}
		return false;
	}
	public Object get(int pos)
	{
		if (pos>=0 && pos<=count) {
			return arr[pos];
		} 
		else {
			throw new IllegalArgumentException("give valid position");
		}
	}
	public boolean add(int pos,Object o)
	{
		if (pos<=0 && pos<=count+1) {
			for (int i = pos; i < count-1; i++) {
				arr[i+1] = arr[i];
			}
			arr[pos] = o;
			count++;
			return true;
		} else {
			throw new IllegalArgumentException("give valid position");
		}
	}
}
