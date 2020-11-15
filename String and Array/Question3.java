/* ) Create an array of ints with size 10. Insert 10 random integer values
between 0-100 into it (using a for loop). Print out its value to the console
using the length variable (in another for loop) and for-each loop. */ 

public class Question3
{
	public static void main(String[] args)
	{
		loops();
	}
	public static void loops()
	{
	int[] irr = {10,20,30,40,50,60,70,80,90,100};
	for(int i=0; i<irr.length; i++)
	{
		System.out.println(irr[i]);
	}
	for(int x : irr)
	{
		System.out.println(x);
	}
	}
}
	
		
