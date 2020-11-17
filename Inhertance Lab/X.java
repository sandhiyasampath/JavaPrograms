/* 4) Create a class X. Create an int field a and assign 10 to it.Create an instance initializer and put in SOP("in inst init 1 a = "+a);
and change a value to 20.Create another instance initializer and put in SOP("in inst init 2 a = "+a);and change a value to 30.
Create a no-arg constructor, print value of a and then assign 40 to it.In a Tester class, in main()-> create object of X and then print obj.a
to the monitor.Do you understand how the initialisation is happening?Now add a static variable in X named b = 15. Create 2 static init where
you print the value of b and change them like earlier. Add printing of X.b in Tester class and then run it. Do you understand now how the initialisation is occuring. Create one more object of X and see ifthe static initializers are getting fired.Now create a subclass of X named Y with same class defn (copy paste)except change the name of var to c and d and SOPs to indicate Y class.Now in Tester class, create object of Y. Think what should be the order of execution of init and constructors. Verify if that is correct.Ask doubts if you have any.
X.java->
public class X
{
int a = 10;
static int b = 15;
static
{
System.out.println("in static init 1 b = "+b);
b = 25;
}
{
System.out.println("in inst init 1 a = "+a);
a = 20;
}
{
System.out.println("in inst init 2 a = "+a);
a = 30;
}
static // does order matter for init execution?
{
System.out.println("in static init 2 b = "+b);
b = 35;
}
public X()
{
System.out.println("in constr of X a = "+a);
a = 40;
}
}
Y.java->
public class Y extends X
{
int c = 10;
static int d = 25;
static
{
System.out.println("in static init 1 d = "+d);
d = 35;
}
static
{
System.out.println("in static init 1 d = "+d);
d = 45;
}
{
System.out.println("in inst init 1 c = "+c);
c = 20;
}
{
System.out.println("in inst init 2 c = "+c);
c = 30;
}
public X()
{
System.out.println("in constr of X c = "+c);
c = 40;
}
} */
package InterfaceLab;
public class X
{
	static int b = 5;
	int a = 10;
	static
	{
		System.out.println("in X class static init 1 b = "+b);
		b = 15;
	}
	static
	{
		System.out.println("in X class static init 2 b = "+b);
		b = 25;
	}
	{
		System.out.println("in X class inst init 1 a = "+a);
		a = 20;
	}
	{
		System.out.println("in X class inst init 2 a = "+a);
		a = 30;
	}
	public X()
	{
		System.out.println("in X class  const a = "+a);
		a = 40;
	}
}
class Y extends X
{
	static int d = 5;
	int c = 10;
	static
	{
		System.out.println("in Y class static init 1 d = "+d);
		d = 15;
	}
	static
	{
		System.out.println("in Y class static init 2 d = "+d);
		d = 25;
	}
	{
		System.out.println("in Y class inst init 1 c = "+c);
		c = 20;
	}
	{
		System.out.println("in Y class inst init 2 c = "+c);
		c = 30;
	}
	public Y()
	{
		System.out.println("in Y class const c = "+c);
		c = 40;
	}
}
class TestX
{
	public static void main(String[] args)
	{
		System.out.println(X.b);
		X obj = new X();
		System.out.println(obj.a);
		X obj2 = new X();
		Y obj3 = new Y();
	}
}
