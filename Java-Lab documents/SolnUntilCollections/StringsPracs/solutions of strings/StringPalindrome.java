package uttara.solutions.strings;
//WAM to test whether a given string is a palindrome
public class StringPalindrome {



	public static void main(String[] args)
	{
		//String s=args[0];  passing the value through command line
		String s="madamv";
	    boolean b=palindrome(s);
		if(b)
			System.out.println(s +" is palindrome");
		else
			System.out.println(s +" is not palindrome");


	}
	public static boolean palindrome(String s)
	{
		char[] ch=s.toCharArray();
		int length=ch.length;
		for(int i=0;i<length/2;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
				return false;
		}
		return true;



	}

}
