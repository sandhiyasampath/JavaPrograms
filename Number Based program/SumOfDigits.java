/*12)WAP to sum the digits in an int input and return it!*/

public class SumOfDigits
{
	public static void main(String[] args)
	{
		isSumOfDigitsOfGivenInput(123456);	
	}
	public static void isSumOfDigitsOfGivenInput(int num)
	{
	int remainder = 0;
	while(num!=0)
	{
		remainder = num%10 + remainder;
		num = num/10;
	}
	System.out.println(remainder+" is sum of given input");
	}
}

