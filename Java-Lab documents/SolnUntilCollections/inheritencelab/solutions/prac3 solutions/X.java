/*Check if instance variables of type string, int and boolean are given
default values. Check if local variables are given default values.
How to do this? Create a class with 4 instance variables with String,
boolean, int and boolean as datatypes. Create a Tester class with main
where you create an object and using reference print the instance variable
values to monitor using SOP.*/
public class X
{
	int a;
	double d;
	boolean b;
	String s;

	public static void main(String[] args)
	{
		int i=10;
		System.out.println(i);
		X obj = new X();
		System.out.println("obj.a = "+obj.a);
		System.out.println("obj.d = "+obj.d);
		System.out.println("obj.b = "+obj.b);
		System.out.println("obj.s = "+obj.s);
	}
}
