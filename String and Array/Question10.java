/* 10) WAM to pass 2 arrays of ints to a method. The method should return
the max value present across both the array elements. */ 

public class Question10
{
	public static void main(String[] args)
	{
	int[] ir1 = {10,20,30,40,50,60};
	int[] ir2 = {15,25,35,45,55,65,75};
	maxIntOfGivenArray(ir1,ir2);
	}
	public static void maxIntOfGivenArray(int[] a,int[] b)
	{
	int c = (a.length > b.length) ? a.length : b.length;
	int bigger1 = 0;
	int bigger2 = 0;
	int bigger = 0;
	for(int i=1; i<a.length; i++)
	{
		int n1 = a[i];
		int n2 = a[i-1];
		bigger1 = ((n1>n2) ? n1 : n2);
	}
	for(int j=1; j<a.length; j++)
	{
		int n1 = b[j];
		int n2 = b[j-1];
		bigger2 = ((n1>n2) ? n1 : n2);
	}
		bigger = ((bigger1>bigger2) ? bigger1 : bigger2);
		System.out.println("bigger value of given two array "+bigger);
	}
	
}
