public class Fibonacci
{
	public static void main(String[] args)
	{
		isFibonacci(20);
	}
	public static void isFibonacci(int num)
	{
	int[] arr = new int[num];
	arr[0] = 1;
	arr[1] =1;
	for(int i =2; i<num; i++)
	{
		arr[i] = arr[i-1]+arr[i-2];
	}
	System.out.println("Fibonacci series for given number");
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
	}
}
