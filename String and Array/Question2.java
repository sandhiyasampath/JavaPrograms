/* 2) Create an array of ints with size 10. Insert 10-1 integer numbers into it
(using a for loop). Print out its value to the console using the length
variable (in another for loop) and for-each loop. */
public class Question2
{
	public static void main(String[] args)
	{
		forAndForEachLoop();
	}
	public static void forAndForEachLoop()
	{
	int[] arr = new int[10];
	for(int i=0; i<arr.length; i++)
	{
		arr[i] = arr.length-(i);
	}
	for(int j=0; j<arr.length; j++)
	{
		System.out.println(arr[j]);
	}
	for(int x : arr)
	{
		System.out.println(x);
	}
	}
}
		
