/* 9) Code a method to accept an int as input and print the following. If
the int num is 4, printed output should be!
1234
123
12
1
if the int num is 7, printed output should be
1234567
123456
12345
1234
123
12
1 */
public class NumberPatern
{
	public static void main(String[] args)
	{
		PaternForGivenNumber(10);
	}
	public static void PaternForGivenNumber(int num)
	{
	for(int i=0; i<=num;i++)
	{
		for(int j=1; j<=num-i; j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}
}
