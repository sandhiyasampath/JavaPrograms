/* 2) Check if instance variables of type string, int and boolean are given
default values. Check if local variables are given default values.
How to do this? Create a class with 4 instance variables with String,
boolean, int and boolean as datatypes. Create a Tester class with main
where you create an object and using reference print the instance
variable values to monitor using SOP.
Ex:
class X
{
int i;
String str;
public static void main(String[] args)
{
X obj = new X();
System.out.println(obj.i);
System.out.println(obj.str);
}
} */

public class Question2
{
	String name;
	int i;
	boolean b;
	public static void main(String[] args)
	{
	Question2 q = new Question2();
	System.out.println("name = "+q.name);
	System.out.println("i = "+q.i);
	System.out.println("b = "+q.b);
	}
}
	
