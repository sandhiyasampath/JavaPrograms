/*5) WAP to test whether an int is a power of 2 !*/
public class PowerOfTwo
{
	public static void main(String[] args)
	{
	isPowerOfTwo(47);
	}
	public static void isPowerOfTwo(int num)
	{
	int val = 0;
	if(num%2!=0)
	System.out.println(num+" is not a Power of two");
	else
	{
	for(int i=2; i<num; i+=2)
	{
		val=i*2;
		if(num==val)
		{
			System.out.println(num+" is a Power of two");
		}
		
	}
	}
	}
}
