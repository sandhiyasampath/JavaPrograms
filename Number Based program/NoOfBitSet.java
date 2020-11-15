public class NoOfBitSet
{	
	static int count = 0;
	public static void main(String[] args)
	{
		hasHowManyBitSetToOne(10);
	}
	public static void hasHowManyBitSetToOne(int num)
	{
	for(int i=1; i<32; i++)
	{
		if((num & 1)==1)
		{
			count++;
		}
		num = num>>1;
	}
	System.out.println("number of bit set to one in the given number is = "+count);
	}
}
