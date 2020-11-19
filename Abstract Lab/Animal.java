/* 1) Create an Animal class. An Animal can eat and sleep. When an Animal is asked to sleep, it closes its eyes and sleeps.
We do not know how an Animal eats. What kind of method will you code for eat? Mark eat method abstract (no body => public void eat();). See if Animal.java will compile. Mark Animal class abstract and see if the compilation succeeds. Create an instance variable in Animal as String name. Create a no-arg constructor and parameterised constructor (which accepts a string and assigns it to name). 
Put SOPs in both the constructors. Is compilation succeeding? 
Can you have constructors in an abstract class? Create a TestAnimal class with main(). 
Try to create an object of Animal. Does it work? Now create a Croc extends Animal, add a new method swim() with SOP, 
create one no-arg constructor with SOP and parameterised constructor which accepts string and passes the string to parent constructor by invoking super(s). In Tester class, create a croc object and invoke eat() and sleep(). What SOPs are being printed out? Are you able to understand this? Override sleep() in Croc and see which implementation gets picked up by executing same tester class. */
package Abstractlab;
public abstract class Animal
{
	String name;
	public Animal()
	{
		System.out.println("in animal class no arg const");
	}
	public Animal(String animalName)
	{
		System.out.println("in animal class parameterized const");
		name = animalName;
	}
	public abstract void eat();
	public void sleep()
	{
		System.out.println("i am a animal sleeping with eyes closed");
	}
}
class Croc extends Animal
{
	String name;
	public Croc()
	{
		System.out.println("in Croc class no arg const");
	}
	public Croc(String animalName)
	{
		super(animalName);
		System.out.println("in Croc class parameterized const");
		name = animalName;
	}
	public void eat()
	{
		System.out.println("i am a animal eating");
	}
	public void sleep()
	{
		System.out.println("i am a animal sleeping with eyes opened");
	}
}
class TestAnimal
{
	public static void main(String[] args)
	{
		Croc c = new Croc();
		c.eat();
		c.sleep();
	}
}
