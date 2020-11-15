/* 13) WAP to create a 2 dimensional int array with 3 as first dimension
size. Create unidimensional arrays with size 2 and store numbers in the
2-D array. Now loop over the arrays and display the value accordingly. */

public class Question13
{
	
	    public static void main(String[] args)
		{
		int[][] arr = new int[3][];
		//add the new int[] syntax when assigning a value (not required if you are assigning when declaring the variable)
		arr[0] = new int[] {10,20};
		arr[1] = new int[] {10,20,30};
		arr[2] = new int[] {10,20,30,40};
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		} 
}

	
