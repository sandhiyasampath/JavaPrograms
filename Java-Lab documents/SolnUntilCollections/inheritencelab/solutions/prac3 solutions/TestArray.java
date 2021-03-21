/*WAP to create an array with 10 size and of int holding ability. Store
values 1-10 in it. Using the length variable, access each element of the
array and print it to the console. Create the array in 2 ways - one using
the new operator and then storing the values individually, two by creating
the array with the values directly in the array. Loop over the array using
an index variable.Also loop over it using for-each loop.*/
public class TestArray
{
	public static void main(String[] args)
	{
		int[] arr = {10,20,30}; //new int[10];
		System.out.println("length = "+arr.length);

	//	for(int i = 0 ; i < arr.length ; i++)
	//		System.out.println("int at pos "+i+" = "+arr[i]);

		for(int x : arr)
			System.out.println(x);

		String[] sa = {"one","two","three"};//new String[3];
		//sa[0] = "ond";
		//sa[1] = "yerad";
		//sa[2] = "moor";
		for(String s : sa)
			System.out.println(s);
	}

}




