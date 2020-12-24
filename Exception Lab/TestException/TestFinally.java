package com.java.Testexception;
public class TestFinally {
	public int m1() {
		int x = 10;
		try {
			System.out.println("m1() try excecuted");
			System.out.println("in m1() x = "+x);
			Object o = null;
			System.out.println(o.hashCode());
			return ++x;
		}
		catch(Exception ex) {
			System.out.println("m1() catch excecuted");
			System.out.println("in catch of m1() "+ex.getMessage());
			Object a = null;
			a.notify();
			return ++x;
		}
		finally
		{
			System.out.println("m1() finally excecuted");
			Object a = null;
			a.notify();
			System.out.println("in finally() of m1() x = "+x);
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("main try excecuted");
			TestFinally t = new TestFinally();
			t.m1();
		}
		catch (Throwable e) {
			System.out.println("main catch excecuted");
			e.printStackTrace();
		}
	}

}
