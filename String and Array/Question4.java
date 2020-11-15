/* 4) Create a method called public static void test(int[] arr). Create literal
array {10,20,30,40} in main(). Invoke test() and pass this literal array as
parameter. Print out its value to the console using the length variable (in
another for loop) and for-each loop in test(). */

public class Question4
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40};
		test(arr);
	}
	public static void test(int[] arr)
	{
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	for(int x : arr)
	{
		System.out.println(x);
	}
	}
}
