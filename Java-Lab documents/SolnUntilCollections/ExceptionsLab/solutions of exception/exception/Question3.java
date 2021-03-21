/*Create an Animal class (empty body) and a subclass called Pig (empty body). Create a
class called TextEx with a method m1(). In m1(), put an SOP(“m1()") and invoke m2() of
same class. In m2(), invoke m3()
In main(), invoke m1(). Embed in try..catch, print ST. Identify bad code and fix it!*/
package uttara.solutions.exception;
public class Question3 {
	public static void m1()
	{
		System.out.println("m1()");
		m2();
	}
	public static void m2()
	{
		System.out.println("in m2()");

		Animal a = new Animal();
		m3(a);

		Pig p = new Pig();
		m3(p);

	}
	public static void m3(Animal a)
	{
		System.out.println("in m3()");
		//Pig p = (Pig) a;//classcastexception,it will compile but in runtime we get this exception because wherever parent is expected we can pass child but vice-versa cant do
		if(a instanceof Pig)
		{
			Pig p=(Pig)a;
		}
	}

	public static void main(String[] args) {
		try
		{
		Question3.m1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
