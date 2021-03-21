package com.uttara.io;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		 
		// to read primitives and single word input
		Scanner sc1 = new Scanner(System.in); 
		// to read only sentence input
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc1.next();
		System.out.println("name = "+name);
		System.out.println("Enter age as an integer");
		int age = sc1.nextInt();
		System.out.println("age = "+age);
		System.out.println("Enter your salary as decimal");
		double d = sc1.nextDouble();
		System.out.println("d = "+d);
		
		System.out.println("What is your story?");
		String story = sc2.nextLine();
		System.out.println("story = "+story);
		
	}

}






