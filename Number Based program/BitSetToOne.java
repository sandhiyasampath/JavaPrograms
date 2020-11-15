public class BitSetToOne
{
	public static void main(String[] args  )
	{	
		isBitSetIsOne(-1>>>1);
	}

	public static void isBitSetIsOne(int a)
	{
		int count = 0;
		int val = 0;
		for(int i=0; i<32; i++)
		{
			val=a & 1;
				if(val==1)
				{
					count++;
				}
			a=a>>1;
		}
		System.out.println(count);
	}
}
