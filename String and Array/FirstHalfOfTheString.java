/* Question: Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
Sample Input: 1. firstHalf("WooHoo") -> Woo 2. firstHalf("HelloThere") -> Hello
Sample Output: 3. firstHalf("abcdef") -> abc */
public class FirstHalfOfTheString
{
	public static void main(String[] args)
	{
		firstHalf("hahavovo");
	}
	public static String firstHalf(String str)
	{
		char[] cr = str.toCharArray();
		char[] cr1 = new char[cr.length/2];
		if(str.length()%2==0)
		{
			for(int i=0; i<cr1.length; i++)
			{
				cr1[i] = cr[i];
			}
		}
		str = new String(cr1);
		return str;
	}
}



