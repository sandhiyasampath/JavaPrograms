package com.java.InnerClassDemo;

public class AnnonymousInnerClass {
	public int i = 10;
	public void print() {
	new Thread()
	{
		public void run() {
				System.out.println(Thread.currentThread().getName()+" in annonymous inner class i = "+i);
		}
	}.start();
	
	Thread t1 = new Thread(new Runnable()
			{
				
				public void run() {
					System.out.println(Thread.currentThread().getName()+"running");
				}
			});
		t1.start();
	}	
}
