/*9) Print "divisible" and the number if the num is divisible by 3 or 5 and not both between 1 to 100 */
public class DivisibleByThreeOrFiveNotBoth
{
	public static void main(String[] args)
	{
		divisible();
		divisible();
		divisible();
	}
	public static void divisible()
	{
	for(int i=1; i<=100; i++)
	{
		if((i%3==0)^(i%5==0))
		System.out.println(i+" is divisible");
		else
		System.out.println(i+" is not divisible");
	}	
	}
}
