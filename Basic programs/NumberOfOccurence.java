/* 21) *important repeat problem* Create a method to accept 2 strings and find
number of occurrences of second string in first string and return the result. */

public class NumberOfOccurence
{
	static int count;
	public static void main(String[] args)
	{
		numberOfOccurencesInOneInAnother("ab cd ef gh ghef ef ef lhsfef","ef");
	}
	public static void numberOfOccurencesInOneInAnother(String s1, String s2)
	{
		int a = 0;
		int b = 0;
		for(int i = 0; i<s1.length(); i++)
		{
			if(s1.indexOf(s2,b)>0)
			{
				a = s1.indexOf(s2,b);
				b = a + 1;
				count++;
			}
		}
		System.out.println(s1.length());
		System.out.println(count);
	}
}
