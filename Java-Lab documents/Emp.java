package com.uttara.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Emp implements Comparable<Emp>{

	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	@Override
	public int compareTo(Emp o) {
		
		if (this.age == o.age)
			if(this.height == o.height)
				return this.name.compareTo(o.name);
			else
				return (int) (Math.ceil(this.height) - Math.ceil(o.height));
		else
			return this.age - o.age;
		
	}
	
	public static void main(String[] args) {
		
		EmpNameComparator enc = new EmpNameComparator();
		EmpHeightComparator ehc = new EmpHeightComparator();
		
		Emp e1 = new Emp("Ramu",20,165);
		Emp e2 = new Emp("Bheemu",24,215);
		Emp e3 = new Emp("Somu",30,165);
		Emp e4 = new Emp("Ramu",20,165);
		
		/*
		Set<Emp> emps = new TreeSet<Emp>(enc);
		
		System.out.println("e1.eq(e4) = "+e1.equals(e4));
		System.out.println("e1.hash = "+e1.hashCode()+" e4.hash = "+e4.hashCode());
		System.out.println("e1 = "+e1);
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		
		System.out.println("emps = "+emps);
		*/
		
		List<Emp> listEmps = new ArrayList<Emp>();
		listEmps.add(e1);
		listEmps.add(e2);
		listEmps.add(e3);
		listEmps.add(e4);
		listEmps.add(e1);
		listEmps.add(e1);
		
		System.out.println("listEmps = "+listEmps);
		Collections.sort(listEmps);
		System.out.println("listEmps = "+listEmps);
		Collections.sort(listEmps,enc);
		System.out.println("listEmps = "+listEmps);
		Collections.sort(listEmps,ehc);
		System.out.println("listEmps = "+listEmps);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(40);
		nums.add(30);
		nums.add(30);
		nums.add(30);
		nums.add(30);
		nums.add(30);
		nums.add(30);
		nums.add(13);
		nums.add(5);
		
		System.out.println("nums = "+nums);
		Collections.shuffle(nums);
		System.out.println("nums = "+nums);
		System.out.println("checking if 30 is present = "+ nums.contains(30));
		int numOcc = Collections.frequency(nums, 30);
		System.out.println("numOcc = "+numOcc );
	
		List<Integer> unmodifNums = Collections.unmodifiableList(nums);
		
		
	}

}

class EmpNameComparator implements Comparator
{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		if (o1 instanceof Emp && o2 instanceof Emp)
		{
			Emp e1 = (Emp) o1;
			Emp e2 = (Emp) o2;
			
			return e1.getName().compareTo(e2.getName());
		}
		else
			throw new IllegalArgumentException("only emps can be compared");
	}

}

class EmpHeightComparator implements Comparator
{
	
	@Override
	public int compare(Object o1, Object o2) {
		
		if (o1 instanceof Emp && o2 instanceof Emp)
		{
			Emp e1 = (Emp) o1;
			Emp e2 = (Emp) o2;
			
			if ((e1.getHeight()-e2.getHeight()) > 0)
				return 1;
			else
				if ((e1.getHeight()-e2.getHeight()) ==0)
					return 0;
				else
					return -1;
		}
		else
			throw new IllegalArgumentException("only emps can be compared");
	}

}




