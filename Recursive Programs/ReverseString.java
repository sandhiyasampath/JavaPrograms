package RecursiveProgram;
public class ReverseString
{
	public static void main(String[] args)
	{
		System.out.println(reverse("abcde"));
	}
	public static String reverse(String s)
	{
		if(s.length()==1)
		return s;
		else
		return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
	}
}
