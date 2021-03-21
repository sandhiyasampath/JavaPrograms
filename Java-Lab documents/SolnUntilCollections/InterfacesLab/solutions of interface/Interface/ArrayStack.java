package uttara.solutions.Interface;

import java.util.Iterator;

public class ArrayStack implements Stack
{
	int[] arr = new int[10]; // instance variable where elements will be stored

	int count=0; // to keep a track of how many elements are filled into the stack

	public void push(int element)
	{
		if(count<arr.length)
		{
			count++;
			arr[count]=element;
			
		}
	}
	public int pop()
	{
		  int temp=arr[count];
		  arr[count]=0;
		  count--;
		  return temp;
		                                                      
	}
	public int peek()
	{
		
		return arr[count];
		 
	}
	public void printElements()
	{
	  
		for(int k=arr.length-1;k>=0;k--)
		{
			
			if(arr[k]!=0)
			{
				System.out.print(arr[k]+" ");                  // using reverse for loop here...
			}
		}
		System.out.println();
		
	}
}
