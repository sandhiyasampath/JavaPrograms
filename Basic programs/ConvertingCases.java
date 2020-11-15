/* 3) Code a method to accept a string and return a string with all uppercase letters
converted to lowercase and vice versa with every other char retained as is.
Ex: aBC$1 => Abc$1 */
public class ConvertingCases
{
	public static void main(String[] args)
	{
		convertingCases("AAbbCCdd1234!@#$");
	}
	public static void convertingCases(String s)
	{
		char[] cr = s.toCharArray();
		for(int i = 0; i<s.length(); i++)
		{
			if((int)cr[i]>=65 && (int)cr[i]<=88)
			{
				cr[i] = Character.toLowerCase(cr[i]);
			}
			else if ((int)cr[i]>=97 && (int)cr[i]<=123)
			{
				cr[i] = Character.toUpperCase(cr[i]);
			}
		}
		s = new String(cr);
		System.out.println(s);
	}
}
