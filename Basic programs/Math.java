/* 7) Create a Math class with the following methods (overload methods - same method
name with different argument lists just like constructor overloading):
i) Ability to add 2 ints
ii) Ability to add 2 doubles
iii) Ability to add 2 complex numbers. Create a Complex class with 2 int instance variables
a and b. a represents the real part and b the imaginary. */

public class Math
{
	public static void main(String[] args)
	{
		add(5,7);
		add(5.5,4.5);	
	}
	public static void add(int a,int b)
	{
		int c = a+b;
		System.out.println("in Int method "+c);
	}
	public static void add(double a,double b)
	{
		double c = a+b;
		System.out.println("in double method "+c);
	}

}

