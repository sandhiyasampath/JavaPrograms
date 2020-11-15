/* /* 1) WAP to create an array with 10 size and of int holding ability. Store
values 1-10 in it. Using the length variable, access each element of the
array and print it to the console. Create the array in 2 ways - one using
the new operator and then storing the values individually, two by
creating the array with the values directly in the array. Loop over the
array using an index variable.Also loop over it using for-each loop.
Ex:
int[] arr1 = new int[10]; // to create an empty array
int[] arr2 = {10,20,30}; // to create a literal array
for(int i = 0 ; i < arr1.length ; i++) // to loop over the array
System.out.println("value in "+i+"th box = "+arr1[i]);
for(int val : arr2)
System.out.println(val); */
public class Question1
{
public static void main(String[] args)
{
	int[] ia = new int[10];
	System.out.println("Using length variable");
	for(int i=0; i<ia.length; i++)
	{
		ia[i] = i+1;
		
		System.out.println(ia[i]);
	}
	storeOneToTen();
}
public static void storeOneToTen()
{
	System.out.println("Using for each loop");
	int[] arr = {1,2,3,4,5,6,7,8,9,10};
	for(int x:arr)

	System.out.println(x);
}

}
