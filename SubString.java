/* Question: Given a string and an int n, return a string made of the first and last ' n' chars from the string. The string length will be at least n.
Sample Input: 1. nTwice("Hello", 2) -> Helo , 2. nTwice("Chocolate", 3) -> Choate ,
Sample Output: 3. nTwice("Chocolate", 1) -> Ce
Question Points: 10 */
public class SubString
{
	public static void main(String[] args)
	{
		nTwice("Chocolate",3);
	}
	public static String nTwice(String str, int n)
	{
		if(str.length()>n)
		{
			String str1 = str.substring(0,n) + str.substring(str.length()-n,str.length());
			return str1;
		}
		return "give valid string";
	}
}


