/* 13)Code an add() method that will add all the numbers given and return the result (use
array of ints as param to the add() method). See AddArrayElements.java if you have a
doubt. */
public class AddElementsOfIntArray
{
	public static void main(String[] args)
	{	
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		addingElementsInGivenIntArray(arr);
	}
	public static void addingElementsInGivenIntArray(int[] irr)
	{
		long c = 0;
		for(int x : irr)
		{
			c=c+x;
		}
		System.out.println(c);
	}
}
