/*15)AP to swap 2 ints without using a temp variable!*/

public class SwapInt
{
	public static void main(String[] args)
	{
		swapingGivenInt(10,20);
	}
	public static void swapingGivenInt(int num1,int num2)
	{
	System.out.println("before swapin num1 = "+num1+" num2 = "+num2);
	num1 = num1^num2;
	num2 = num1^num2;
	num1 = num1^num2;
	System.out.println("After swaping num1 = "+num1+" num2 = "+num2);
	}
}
	
