/* 10) Create the following static overloaded methods with simple SOPs in a class named X:
test(long)
test(double)
test(short)
Now try invoking the test() from main() by passing 5, 5.5, 5.5f,10L, a byte as parameter
and understand which method body is being picked. Do you understand how the decision
is made to pick which method body? */

public class X
{
	public static void main(String[] args)
	{
		test(10l);
		test(12);
		test(12.3);
		test(12.3f);
	}
	public static void test(long l)
	{
		System.out.println(l+" In long method");
	}
	public static void test(short l)
	{
		System.out.println(l+" In short method");
	}
	public static void test(double l)
	{
		System.out.println(l+" In double method");
	}
}
