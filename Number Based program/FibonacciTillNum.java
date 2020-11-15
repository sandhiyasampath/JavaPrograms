public class FibonacciTillNum
{
	public static void main(String[] args)
	{
		isFibonacci(13);
	}
	public static void isFibonacci(int a)
	{
		int[] arr = new int[a];
		arr[0] = 1;
		arr[1] = 1;	
		int val = 0;
		z:for(int i = 2; arr[i-1]<=arr.length; i++)
		{
			arr[i] = arr[i-1]+arr[i-2];
			if(arr[i] ==a)
			{
				val = i;
				break z;
			}	
		}
		int size = val + 1;
		int[] arr1 = new int[size];
		for(int j=0; j<arr1.length; j++)
		{		
			arr1[j]=arr[j];
		}
		System.out.println("fibonacci series for Given number");
		for(int x : arr1)
		{
			System.out.print(x+" ");
		}
	}
}
		
			
				
				
