package RecursiveProgram;
public class Factorial
{
	public static void main(String[] args)
	{
		System.out.println(fact1(5));
		System.out.println(fact2(5));
	}
	static int sum = 1;
	public static int fact1(int num)
	{
		if(num<=0)
		return 1;
		else
		{
			sum = sum *num ;
			num = num - 1;
			fact1(num);
			return sum;
		}
	}
	public static int fact2(int num)
	{
		if(num==0 || num == 1)
		return 1;
		else
		return num*fact2(num-1);
	}
}
