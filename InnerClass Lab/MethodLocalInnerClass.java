package com.java.InnerClassDemo;

public class MethodLocalInnerClass {
	public int x = 10;
	public void print() {
		final int y = 20;
		class Inner{

			public void print() {
				System.out.println("in method local inner class x = "+y);
			}
		};
		Inner i = new Inner();
		i.print();

	}

}
