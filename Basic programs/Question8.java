/* 8) Write a method to accept an int input. If the number is even, it
should print “shambo” the given number of times. If it is odd, it
should print “govinda” that many number of times.! */
public class Question8
{
	public static void main(String[] args)
	{
		isEvenPrintShampooThatManyTimesElseGovinda(3);
	}
	public static void isEvenPrintShampooThatManyTimesElseGovinda(int num)
	{
	for(int i=1; i<=num; i++)
	{
		if(num%2==0)
		{
			System.out.println("shambo");
		}
		else
		{
			System.out.println("govinda");
		}
	}
	}
}
