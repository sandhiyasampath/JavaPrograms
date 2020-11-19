/* 19) Create a method to accept a string as parameter and return how many vowels
are present in it. */

public class Vowel
{
	static int count;
	public static void main(String[] args)
	{
		vowelsInAString("Sandhiya");
	}
	public static void vowelsInAString(String s)
	{
		for(int i = 0; i<s.length(); i++)
		{
			char[] crr = s.toCharArray();
			char c = crr[i];
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
	System.out.println(count);
	}
}
	
