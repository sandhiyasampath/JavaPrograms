package com.java.exception;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		if(name.length()==0 || name==null)
			throw new IllegalArgumentException("If This Person has name Then giva a valid name");
		this.name = name;
		if(age<=0 || age>=150)
			throw new IllegalArgumentException("Is this person born or already dead Please give valid age");
		this.age = age;

	}
	public void setName(String name) {
		if(name.length()==0 || name==null)
			throw new IllegalArgumentException("If This Person has name Then giva a valid name");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if(age<=0 || age>=150)
			throw new IllegalArgumentException("Is this person born or already dead Please give valid age");
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void dance(String s) throws DanceFailureException{
		if(age>50)
			System.out.println("I am dancing salsa");
	}
}
