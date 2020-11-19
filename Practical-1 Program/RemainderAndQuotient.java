/*11) WAP to Divide any two int values and get the output of remainder and quotient?*/
public class RemainderAndQuotient
{
	public static void main(String[] args)
	{
		dividingTwoIntPrintingRemainderQuotient(20,5);
	}
	public static void dividingTwoIntPrintingRemainderQuotient(int num1,int num2)
	{
		int quotient = ((num1>num2) ? num1 : num2)/ ((num1>num2) ? num2 : num1);
		int remainder = ((num1>num2) ? num1 : num2) % ((num1>num2) ? num2 : num1);
		System.out.println("Quotient = "+quotient+" remainder = "+remainder);
	}
}
	

