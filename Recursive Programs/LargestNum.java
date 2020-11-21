package RecursiveProgram;
public class LargestNum
{
	/* Psudo code
	1. val 1 = 1^st element of Array
	2.val 2 = largest(rest of all elements sending as array)
	3.if val 1 > val 2 
		return val 1;
	else
		return val 2; */
	public static void main(String[] args)
	{
		int[] ir = {10,50,20,30};
		System.out.println(largest(ir));
	}
	public static int largest(int[] arr1)
	{
		if(arr1.length == 1)
		return arr1[0];
		int val1 = arr1[0];
		int[] arr2 = new int[arr1.length-1];
		for(int i = 1; i<arr1.length; i++)
		arr2[i-1] = arr1[i];
		int val2 = largest(arr2);
		if(val1>val2)
		return val1;
		else
		return val2;
	}
}
