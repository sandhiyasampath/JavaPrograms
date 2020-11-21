package RecursiveProgram;
public class SumOfElements
{
	public static void main(String[] args)
	{
		int[] r = {10,20,30,10,10,10,10}; 
		System.out.println(sum(r));
	}
	public static long sum(int[] arr)
	{
		if(arr.length==1)
		return arr[0];
		int val1 = arr[0];
		int[] arr1 = new int[arr.length-1];
		for(int i = 1; i<arr.length; i++)
		arr1[i-1] = arr[i];
		long val2 = sum(arr1);
		long sum = val1 + val2;
		return sum;
	}
}
