public class Prime
{
	public static void main(String[] args)
	{
		TestPrime.isPrime(663153371);
	}
}
class TestPrime
{
	public static void isPrime(int a)
	{
		if(a==0 || a==1)
		{
			System.out.println("neither prime nor composite");
		}
		
		int b = 0;
		for(int i=2;i<=a/2;i++)
		{
			b=a%i;
			if(b==0)
			 {
				break;
			 }
		}
		
		if(b==1)
		{
			System.out.println(a+" Given num is prime");
		}
		else
		{
			System.out.println(a+"  Given num is not prime");
		}
		
	}
}












