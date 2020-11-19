/* 5) Code a class named TestLoop with main(). Write the code to print
the following when executed:!
12345678910
12131415161718192021
2223242526272829303132
33...
Print all numbers in 1 line till you get a multiple of 11. Then skip the
multiple of 11 and print the next set of numbers in next line. */
public class Question5
{
	public static void main(String[] args)
	{
		looping(121);
	}
	public static void looping(int num)
	{
	int count = 1;
	for(int i=1; i<=(num/11); i++)
	{
		a:for(int j=1; j<=num; j++)
		{
			if(count%11!=0)
			{
				System.out.print(count);
				count ++;

			}
			else
			{
				count ++;
				break a;
			}
		}
		System.out.println();
	}
	}
}
