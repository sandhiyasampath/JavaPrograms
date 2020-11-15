/* 8) Test whether an int number has an int square root or not (Use Math class) Ex: 16
square root is 4 which is an integer, 20 square root is 4.X which is not an int square root. */
public class MathMethods
{
	public static void main(String[] args)
	{
		intSquareRoot(16);
		intSquareRoot(20);
	}
	public static void intSquareRoot(double num)
	{
		double d = Math.sqrt(num);
		int i = (int)d; 
		if(d==i)
		{
			System.out.println(num+" Square root is "+d+" Which is an int square root");
		}
		else
		{
			System.out.println(num+" Square root is "+d+" Which is not an int square root");
		}
	}
}
		
