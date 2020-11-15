/* 3) Create 3 static methods called process in class called X. Accept Integer i, long l
& float f as params. Now test calling this method from main() by using X.test(5),
X.test(5L), X.test(5.5), X.test(5.5f), X.test(<byte>), X.test(<Long ref>), X.test(<Short
ref>), X.test(<short primitive>) and test your understanding of overloading. */

public class StaticMethodOverloading
{
	public static void main(String[] args)
	{
		process(5);
		process(5L);
		//process(5.5);
		process(5.5f);
	}
	public static void process(Integer i)
	{
		System.out.println("in Integer method "+i);
	}
	public static void process(long i)
	{
		System.out.println("in long method "+i);
	}
	public static void process(float i)
	{
		System.out.println("in float method "+i);
	}
}

