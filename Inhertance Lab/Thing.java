/* 3) Create an interface Thing.
4) Add a method doSomething() to Thing interface. What kind of method is this?
5) Create a Tool class and implement Thing interface. Override the doSomething()
and add a SOP(“Thing doing something”).
6) Create a Spanner that extends Tool, override doSomething() and add a SOP.
7) A TubeLight is a Thing as well. It renders light when you ask it to do something
(simple SOP).
8) In a tester class, create a Spanner object, point it to by a Thing ref, Tool ref and
Spanner ref and invoke doSomething(). See which implementation gets picked
up.
9) Create a Vehicle class that implements Thing. A Vehicle has a name and when
asked to doSomething, it will drive (sop).
10)Create a Person class. Create a testThing() method which takes in any thing as
a parameter. What kind of method is this which should work for all Things?
11)In the tester class, create a Person object,a spanner, a vehicle object and ask
the person to test the spanner and vehicle. Examine the SOP output and verify
which implementations are being picked up and why?*/
package InterfaceLab;
public interface Thing
{
	void doSomething(); // only doSomething() is not allowed you should use atleast return data type
}
class Tool implements Thing
{
	public void doSomething()
	{
		System.out.println("in Tool class thing doing something");
	}
}
class Spanner extends Tool
{
	public void doSomething()
	{
		System.out.println("in Spanner class thing doing something");
	}
}
class TubeLight implements Thing
{
	public void doSomething()
	{
		System.out.println("in TubeLight class renders light");
	}
}
class TestThing
{
	public static void main(String[] args)
	{
		//Thing obj1 = new Spanner();
		//Spanner obj2 = (Spanner)obj1;
		//obj1.doSomething();
		//obj2.doSomething();
		Person p = new Person();
		Spanner s = new Spanner();
		Vehicle v = new Vehicle();
		p.testThing(v);
		p.testThing(s);
	}
}
class Vehicle implements Thing
{
	String name;
	public void doSomething()
	{
		System.out.println("i am "+name+" you can drive me");
	}
}
class Person
{
	public void testThing(Thing t)
	{
		t.doSomething();
	}
}
