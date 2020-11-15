public class Even
{
	public static void main(String[] args)
	{
		TestEven.isEven(5);
	}
}
class TestEven
{
	public static void isEven(int a)
	{
		if(a==0)
		{
			System.out.println("neither even nor prime");
		}
		if(a%2==0)
		{
			System.out.println(a+"= Given number is even");
		}
		else
		{
			System.out.println(a+" = Given number is odd");
		}
	}
}
