/* 12) WAM to pass 2 arrays of ints to a method. The method should return
the second highest of the values across the 2 arrays. */
import java.util.Arrays;
public class Question12
{
	public static void main (String[] args)
	{
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {15,25,35,45,55};
		int in = secondHighestNumberOfGivenArray(arr1,arr2);
	}
	public static int secondHighestNumberOfGivenArray(int[] a,int[] b)
	{
	
	int[] l = new int[a.length + b.length];
	for(int i=0; i<a.length; i++)
	{
		l[i] = a[i];
	}
	int count = 0;
	for(int j=a.length; j<l.length; j++)
	{

		l[j] = b[count];
		count ++;
	}
	Arrays.sort(l);
	System.out.println(l[l.length-2]);
	return l[l.length-2];
	}
} 
