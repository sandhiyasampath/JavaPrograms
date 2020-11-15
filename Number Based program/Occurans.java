/*18)WAP to accept 1 int number and another a digit (given also as an int). Return how
manes time the second parameter occurs in the first number. Ex: 2224, 2 -> 2 occurs 3
times!*/
public class Occurans
{
	static int count = 0;
	public static void main(String[] args)
	{
		howManyTimesSecondNumbersOccursInFirstNumber(1212121,1);
	}
	public static void howManyTimesSecondNumbersOccursInFirstNumber(int n1,int n2)
	{
	int num = n1;
	int lastDigit = 0;
	while(num!=0)
	{
		lastDigit =num%10;
		if(lastDigit==n2)
		{
			count++;
		}
		num = num/10;
	}
	System.out.println(count);
	}
}	
