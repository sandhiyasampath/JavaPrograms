package com.java.Testexception;

import com.java.exception.DanceFailureException;
import com.java.exception.Person;

public class TestPerson {
	public static void main(String[] args) {
		try {
			//Person p1 = new Person("",115);
			//Person p2 = new Person("sandhiya",151);
			Person p3 = new Person("Thirkkavan", 2);
			p3.setName("Sandhiya");
			System.out.println(p3.getName());
			p3.dance("");
		}
		catch(DanceFailureException d) {
			d.printStackTrace();
		}

	}
}
