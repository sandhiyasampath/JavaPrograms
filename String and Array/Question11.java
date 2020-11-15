/* 11) WAM to pass 2 arrays of ints to a method. The method should return
the average of the values across the 2 arrays. The avg returned should
be exact and not an approximation. */
public class Question11
{
	public static void main(String[] args)
	{
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {15,25,35,45,55};
		averageOfGivenTwoArray(arr1,arr2);
		
	}
	public static void averageOfGivenTwoArray(int[] a,int[] b)
	{
	long sum1 = 0;
	long sum2 = 0;
	for(int i=0; i<a.length; i++)
	{
		sum1 = a[i]+sum1;
	}
	for(int j=0; j<b.length; j++)
	{
		sum2 = b[j]+sum2;
	}
	double average = (sum1+sum2)/2.0;
	System.out.println("average of given numbers = "+average);
	}
}
