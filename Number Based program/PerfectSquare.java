public class PerfectSquare
{
	public static void main(String[] args)
	{
		isPerfectSquare(85742);
	}
	public static void isPerfectSquare(int a)
	{
		for(int i=1; i<a/4; i++)
		{
			if(a==(i*i))
			{
				System.out.println(a+" = is perfect square");
				break;
			}
			
		}
				
		System.out.println(a+" = is not a perfect square");
			
		
	}
}
