/* 18) WAM to test whether a given string is a palindrome. */
public class Question18
{
	public static void main(String[] args)
	{
	isPalindrome("sandhiya");
	isPalindrome("madam");
	}
	public static void isPalindrome(String s)
	{
	char[] ca = s.toCharArray();
	char[] ca1 = s.toCharArray();
	for(int i = 0; i<ca.length; i++)
	{
		ca[i] = ca1[ca1.length-1-i];
	}
	String s1 = new String(ca);
	if(s.equals(s1))
	{
	System.out.println("given string is a palindrome "+s);
	}	
	else
	{
	System.out.println("given string is not a palindrome "+s);
	}
	}
}

	
	
