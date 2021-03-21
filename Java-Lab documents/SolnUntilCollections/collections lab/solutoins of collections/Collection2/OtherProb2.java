 /*Test how to use a HashSet and TreeSet with Person (has a name and age)*/

package uttara.solutions.Collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OtherProb2 {

	public static void main(String[] args) {

		Person p1=new Person("datta",24);
		Person p2=new Person("sachin",22);
		Person p3=new Person("nitish",23);
		Person p4=new Person("krisha",34);
		Person p5=new Person("aady",70);
		Person p6=new Person("xcv",12);
		Person p7=new Person("fgh",3);


		Set <Person>hashSet = new HashSet<Person>();
	      hashSet.add(p1);
	      hashSet.add(p2);
	      hashSet.add(p3);
	      hashSet.add(p4);
	      hashSet.add(p5);
	      hashSet.add(p6);
	      hashSet.add(p7);
	      System.out.println(hashSet);

	      // Tree Set....
	      TreeSet <Person>treeSet = new TreeSet<Person>();
	      treeSet.add(p1);                                           // we have to use comparableInterface...
	      treeSet.add(p2);
	      treeSet.add(p3);
	      treeSet.add(p4);
	      treeSet.add(p5);
	      treeSet.add(p6);
	      treeSet.add(p7);
	      System.out.println(treeSet);




	}

}

// Person class...........
class Person implements Comparable<Person>
{
   String name;
   int age;

   public Person() {
	   System.out.println("non arg");
  }


  public Person(String name, int age) {
	super();
	if(name==null||name.equals(""))
	{
		throw new IllegalArgumentException("name should not be blank or null");
	}
	if(name.split(" ").length>1)
	{
		throw new IllegalArgumentException("multiple words are not allowed");
	}
	else

	{
	this.name = name;
	}
	if(age < 0 || age > 100)
	{
		throw new IllegalArgumentException("Is this person born or is he already dead?");
	}
	else
	{
	this.age = age;
	}
}




@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}


public String getName() {
	return name;
}
public void setName(String name) {
	if(name==null||name.equals(""))
	{
		throw new IllegalArgumentException("name should not be blank or null");
	}
	if(name.split(" ").length>1)
	{
		throw new IllegalArgumentException("multiple words are not allowed");
	}
	else

	{
	this.name = name;
	}
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age < 0 || age > 100)
	{
		throw new IllegalArgumentException("Is this person born or is he already dead?");
	}
	else
	{
	this.age = age;
	}
}

// overriding compareto....

@Override
public int compareTo(Person p) {


	return this.name.compareTo(p.name);
}
}