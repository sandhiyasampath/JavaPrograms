/* 20) Create a method to accept a string sentence and reverse all its words in place
and return it. Try different ways of reversing as discussed in class. */

public class ReverseStringSentence
{
	public static void main(String[] aregs)
	{
		reverseString("hi hello how are you");
		reversingWords("hi hello how are you");
	}
	public static void reverseString(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		s = sb.toString();
		System.out.println(s);
	}
	public static void reversingWords(String s)
	{
		String[] sr = s.split(" ");
		String[] sr1 = new String[sr.length];
		for(int i= 0; i<sr.length; i++)
		{
			sr1[i] = sr[sr.length-i-1];
		}
		for(String r: sr1)
		{
			System.out.print(r+" ");
		}
	}
}
