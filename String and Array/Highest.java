/*Given a big string[], find the word whose sum of its characters is the highest.

Ex: {abc, cade, af} => 1+2+3, 3+1+4+5, 1+6 => cade is the highest

Code only method body */
public class Highest
{
	public static void main(String[] args)
	{
		String[] str = {"a","c","t"};
		returnHighestSumString(str);
	}
	public static String returnHighestSumString(String[] str)
	{
		int a = 0;
		int c = 0;
		String s = "";
		for(int i = 0; i<str.length; i++)
		{
			char[] cr = str[i].toCharArray();
			for(int j = 0; j<str[i].length(); j++)
			{
				 c = c + cr[j];		
			}
			if(c>a)
			{
				a=c;
				 s = new String(cr);
			}
		}

		return s;
	}
}
