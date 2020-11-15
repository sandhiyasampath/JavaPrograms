// gsd of two number means which number diveides a given both numbers 
public class GSD
{
	public static void main(String[] args)
	{
		gsdForGivenNum(18,84);
	}
	public static void gsdForGivenNum(int a,int b)
	{
	int gcd = 1;

        for(int i = 1; i <= a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if(a % i==0 && b % i==0)
                gcd = i;
        }

        System.out.printf("GCD of given numbers is "+ gcd);
	}
}
