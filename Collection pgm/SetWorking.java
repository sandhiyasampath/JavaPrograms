package com.uttara.CollectionLab;

import java.util.HashSet;
import java.util.Set;

public class SetWorking {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String s1 = "one";
		String s2 = "two";
		String s3 = "three";
		String s4 = "four";
		String s5 = "five";
		String s6 = "six";
		String s7 = "one";
		System.out.println(s.add(s1));
		System.out.println(s.add(s2));
		System.out.println(s.add(s3));
		System.out.println(s.add(s1));
		System.out.println(s.add(s4));
		System.out.println(s.add(s5));
		System.out.println(s1.hashCode());
		System.out.println(s7.hashCode());

	}

}
