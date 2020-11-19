/* 1) Create a class X. Create an int field a and assign 10 to it.
Create an instance initializer and put in SOP("in inst init 1 a = “+a); and change a
value to 20.
Create another instance initializer and put in SOP("in inst init 2 a = “+a); and
change a value to 30.
Create a no-arg constructor, print value of a and then assign 40 to it.
In a Tester class, in main()-> create object of X and then print obj.a
to the monitor. Do you understand how the initialisation is happening?
Now add a static variable in X named b = 15. Create 2 static init where you print the
value of b and change them like earlier. Add printing of X.b in Tester class and then
run it. Do you understand now how the initialisation is occurring. Create one more
object of X and see if the static initializers are getting fired.
See this below code only after following the instructions above.
 */

public class X
{
	int a = 10;
	static int b = 15;
	static
	{
		System.out.println("in X class static init 1 b = "+b);
		b = 25;
	}
	static
	{
		System.out.println("in X class static init 2 b = "+b);
		b = 35;
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
		System.out.println("in X class  1st no argument constructor a = "+a);
		a = 40;
	}
	public X(int c)
	{
		System.out.println("in X class 2nd parameterised constructor a = "+a);	
		a = c;
	}
}
class Y extends X
{
	int c = 10;
	static int d = 15;
	static
	{
		System.out.println("in Y class static init 1 d = "+d);
		d = 25;
	}
	static
	{
		System.out.println("in Y class static init 2 d = "+d);
		d = 35;
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
		System.out.println("in Y class  1st no argument constructor c = "+c);
		c = 40;
	}
	public Y(int e)
	{
		System.out.println("in Y class 2nd parameterised constructor c = "+c);	
		c = e;
	}
}
class TestX
{
	public static void main(String[] args)
	{
		X obj1 = new X();
		System.out.println(obj1.a);
		System.out.println(X.b);
		X obj2 = new X(10);
		System.out.println(obj2.a);
		System.out.println(X.b);
		Y obj3 = new Y(10);
		System.out.println(obj3.c);
		System.out.println(Y.d);

	}
}
