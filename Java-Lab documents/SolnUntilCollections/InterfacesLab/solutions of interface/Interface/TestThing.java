/*3) Create an interface Thing.
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
package uttara.solutions.Interface;

public class TestThing {

	public static void main(String[] args) {
		Thing t=new Spanner();  // Interface parent reference...
		Tool t2=new Spanner();  // Class parent reference..
		Spanner s=new Spanner();  // own class refrence....
		t.doSomething();  // spanner's implementation is picked here..
		t2.doSomething(); // spanner's implementation is picked here..
		s.doSomething();  // spanner's implementation is picked here..    { Run time polymorphism concept}


		Thing y=new Vehicle("BENZ CARU");
		y.doSomething();

		Person12 p=new Person12();
		p.testThing(s);   // we have pass Any THING here...
		p.testThing(y);

	}

}
