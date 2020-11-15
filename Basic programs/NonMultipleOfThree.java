/*7) Print all non multiples of 3 between 1 to 100 to the monitor*/
public class NonMultipleOfThree
{
	public static void main(String[] args)
	{
	for(int i=1; i<=100; i++)
	{
		if(i%3==0)
		{
			continue;
		}
		else
		{
			System.out.println(i);
		}
	}
	}
}
