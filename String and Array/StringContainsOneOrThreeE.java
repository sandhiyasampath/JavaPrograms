/* Question: Return true if the given string contains 1 or 3 'e' chars. Otherwise return false.
Sample Input: 1. stringE("Hello") -> true 2. stringE("Heelle") ->true
Sample Output: 3. stringE("Heelele") -> false
Question Points: 5 */
public class StringContainsOneOrThreeE
{
	public static void main(String[] args)
	{
		stringE("hehehe");
	}
	public static boolean stringE(String str)
	{
		boolean isContainsOneOrThreeE = false;
		int count = 0;
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)=='e')
			{
				count++;
			}
		}
		if(count==1 || count==3)
		{
			isContainsOneOrThreeE = true;
		}
		return isContainsOneOrThreeE;
  
	}
}


