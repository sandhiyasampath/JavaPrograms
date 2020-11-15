/* 9) WAP (directly in main()) to create an array of strings with 5 colors as
values. Use Math.random() to randomly print out 5 values from the
array. */

public class Question9
{
	public static void main(String[] args)
	{
	String[] srr = {"red","blue","gray","white","orange"};
	String s = srr[(int) (Math.random()*srr.length)];
	System.out.println(s);
	}
}

