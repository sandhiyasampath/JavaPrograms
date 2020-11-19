/* Question: Pass an int as parameter. Find the sum of the digits in the number and return it.
Sample Input: 1. 123 ->6 2. 333 ->9
Sample Output: 3. 143->7 */
public class SumOfDigitOfNumbers
{
	public static void main(String[] args)
	{
		sumOfDigits(12345);
	}
	public static int sumOfDigits(int num)
	{
		int a = 0;
		int sum = 0;
		while(num!=0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		return sum;
	}
}


