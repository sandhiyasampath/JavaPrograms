/* 22) Create a method to accept a string as parameter and return a new string with
all the unicode int values with a dot delimiter. Ex: input is abd, output should be
97.98.100 */
public class Unicode
{
	public static void main(String[] args)
	{
		unicodeValueOfEachCharInAString("abc");
	}
	public static void unicodeValueOfEachCharInAString(String s)
	{
		char[] cr1 = s.toCharArray();
		int[] ir1 = new int[cr1.length];
		for(int i = 0; i<cr1.length; i++)
		{
			ir1[i] = (int)cr1[i];
		}
		for(int x : ir1)
		{
			System.out.print(x+".");
		}
	}
}
