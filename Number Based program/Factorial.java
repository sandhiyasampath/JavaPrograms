/*14) WAP to generate the factorial of a number!*/

public class Factorial
{
	public static void main(String[] args)
	{
		factorialOfNumber(10);
	}
	public static void factorialOfNumber(int num)
	{
	int val = 1;
	while(num!=0)
	{
		val = val*num;
		num--;
	}
	System.out.println("factorial of given number is "+val);
	}
}
