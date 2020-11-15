/* 5)Code an add() method that will add all the numbers given and return
the result (use array of ints as param to the add() method). See
AddArrayElements.java if you have a doubt. 

Now compile and run TestStringMethods.java given as example (when
you run, pass 2 command line inputs like this - java TestStringMethods
abcd pqrs). Go through the code to recap the methods on String we
discussed in class and verify if you understand how it is working. In case
you have any doubt, ask the Lab Instructor. Methods that you need to
use are given in the bottom of the document as well. You can also go
through other given .java files (TestStringMethods.java, TestMath.java,
AddArrayElements.java) */

public class Question5
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50,60,70,80,90};
		long result = add(arr);
		System.out.println("sum of given number's is = "+result);
	}
	public static long add(int[] arr1)
	{
		long sum = 0;
		for(int i=0; i<arr1.length; i++)
		{
			sum = sum + arr1[i];
		}
		return sum;
	}
}

	
	
