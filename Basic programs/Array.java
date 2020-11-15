/* 11) WAP to create an array with 10 size and of int holding ability. Store values 1-10 in it.
Using the length variable, access each element of the array and print it to the console.
Create the array in 2 ways - one using the new operator and then storing the values
individually, two by creating the array with the values directly in the array. Loop over the
array using an index variable.Also loop over it using for-each loop. */

public class Array
{
	public static void main(String[] args)
	{
		int[] ir1 = new int[10];
		for(int i = 0; i<ir1.length; i++)
		{
			ir1[i] = i+1;
		}
		for(int x:ir1)
		{
			System.out.print(x+" ");
		}
		System.out.println(" ");
		int[] ir2 = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i<ir2.length; i++)
		{
			System.out.print(ir2[i]+" ");
		}
	}
}
