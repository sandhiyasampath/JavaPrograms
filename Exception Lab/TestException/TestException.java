package com.java.Testexception;

import com.java.exception.Animal;
import com.java.exception.Pig;

public class TestException {
	public static void m3(Animal a) {
		System.out.println("In m3()...");
		//a = new Pig();
		System.out.println(a instanceof Pig);
		Pig p = (Pig)a;
	}
	public static void m2() {
		System.out.println("In m2()...");
		Animal a = new Pig();
		m3(a);
		Pig p = new Pig();
		m3(p);
	}
	public static void m1() {
		System.out.println("In m1()...");
		m2();
	}
	public static void main(String[] args) {
		try {
			m1();
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
