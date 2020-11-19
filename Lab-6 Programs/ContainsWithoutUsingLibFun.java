/* 5) *Challenge problem* Build a method to accept 2 strings as param and check if
first string content exists in another without using lib functionality. */
public class ContainsWithoutUsingLibFun
{
	public static void main(String[] args)
	{
	}
	public static void findingWhetherFirstStringContainsSecond(String s1,String s2)
	{
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int a = s1.length() > s2.length() ? s1.length : s2.length;
		int a = s1.length() < s2.length() ? s1.length : s2.length;
		for(int i = 0; i<a; i++)
		{
			char c =c1.charAt(c1[i]);
			for(int j = 0; j<b; j++)
			{
				char d =c2. charAt(c2[j])
				if(c==d)
				{
					break;
				}
			}
