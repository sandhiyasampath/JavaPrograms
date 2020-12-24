package com.java.InnerClassDemo;

public class StaticInnerClass {
	public static int x = 100;
	private static int y = 50;
	public int z = 10;
	public static class stcInnrClss {
		private int z = 50;
		public void print() {
			System.out.println("in static inner class x = "+x+" y = "+y+" z = "+z);
		}
	}
	public void useInner() {
		System.out.println("in outer static inner class x = "+x+" y = "+y+" z = "+z);
	}

}

