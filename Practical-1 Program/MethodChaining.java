/*26) Test main() calling another static method x() which should call another static method
y() in the same class. Put SOPs in each method to understand flow of control. How does
the JVM manage control flow? What data structure does it internally use? Create local
variables in each method. Try to access one methods local variable in another method.
Can you access it? Why not? Where are local variables stored in memory? How do you
explain parameter passing? Now create another class with name Test2 and create a static
method named z() in it. Call this method from Test`s main() and see how control flow
occurs.*/
public class MethodChaining
{
	public static void main(String[] args)
	{
		x();

	}
	public static void x()
	{
		System.out.println("x method executed");
		y();
	}
	public static void y()
	{
		System.out.println("y method executed");
		Test2.z();		
	}
}
class Test2
{
	public static void z()
	{
		System.out.println("z method executed");
	}
}
