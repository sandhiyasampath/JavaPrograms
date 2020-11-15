/*11) WAP to identify if an int number is a palindrome!*/

public class Palindrome
{
	public static void main(String[] args)
	{
		isGivenIntIsPalindrome(1010001);
	}
	public static void isGivenIntIsPalindrome(int num)
	{
	String str1 = String.valueOf(num);
	StringBuilder sb = new StringBuilder(str1);
	sb = sb.reverse();
	String str2 = sb.toString();
	if(str1.equals(str2))
	{
		System.out.println("given num "+num+" is palindrome");
	}
	else
	{
		System.out.println("given num "+num+" is not a palindrome");	
	}
	}
}
