/* 15) WAM to pass 2 arrays of ints to a method. The method should return
the max value present across both the array elements. */

public class Question15
{
	public static void main(String[] args)
	{
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {15,25,35,45,55};
		int in = largestNumberOfGivenArray(arr1,arr2);
	}
	public static int largestNumberOfGivenArray(int[] a,int[] b)
	{
	int n1 = 0;
	int n2 = 0;

	for(int i=0; i<a.length; i++)
	{
		n1 = a[i];
		n2 = (n1>n2) ? n1:n2;		
	}
	for(int j=0; j<b.length; j++)
	{
		n1 = b[j];
		n2 = (n1>n2) ? n1:n2;
	}

	System.out.println("largest number of given two arrays is "+n2);
	return n2;
	}
}
