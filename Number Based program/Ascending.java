/*19)WAP to return true if an int input contains all the digits in increasing order (ex: 123 ->
true, 12342->false)!*/

import java.util.Arrays;

public class Ascending
{
	public static void main(String[] args)
	{
		ascendingOrderOfGivenInput(12345);
	}
	public static boolean ascendingOrderOfGivenInput(int num)
	{
	int copyOfInput = num;
	String str = String.valueOf(copyOfInput);
	char[] cr = str.toCharArray();
	Arrays.sort(cr);
	String str1 = String.valueOf(cr);
	if(str1.equals(str))
	{
		System.out.println("true");
		return true;
	}
	else
	{
		System.out.println("false");
		return false;
	}
	}
}
