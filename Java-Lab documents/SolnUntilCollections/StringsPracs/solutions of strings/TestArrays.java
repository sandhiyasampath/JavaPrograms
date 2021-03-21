
package uttara.solutions.strings;
/*WAP to create an array with 10 size and of int holding ability. Store values 1-10 in it. Using the length variable, access each element of the array and print it to the console.
	Create the array in 2 ways - one using the new operator and then storing the values individually, two by creating the array with the values directly in the array.
	Loop over the array using an index variable and the enhanced for as well.*/

   public class TestArrays {


	public static void main(String[] args)
	{
		//creating the array using new operator

		int[] arr=new int[10];  //taking the size as 10.
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;  //assigning the value
		arr[6]=40;
		arr[9]=50;

		for(int i=0;i<arr.length;i++)
			System.out.println("value at "+i+"position is  "+arr[i]);

		//creating the array with the values directly
		String[] sArray={"yudhistira","Arjun","bheema","Nakul","sahadev"};
		for(String s1:sArray)     //using for-each loop.
			System.out.println(s1);



	}

}
