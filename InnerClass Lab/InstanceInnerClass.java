package com.java.InnerClassDemo;

public class InstanceInnerClass {
	private int x = 10;
	class InsInCls {
		public int y = 10;
		public void print() {
			x++;
			System.out.println("in instsnce inner class x = "+x+" y = "+y);
		}
	}
	public void useInnerClass() {
		InsInCls i = new InsInCls();
		i.print();
		
	}
	

}
