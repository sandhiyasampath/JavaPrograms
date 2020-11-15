/* 6) Write a main() program to test methods of string to perform the
following (directly create a string in main() like String str = “abcdef”):
a) check its length
b) print all the chars in string one at a time
c) convert string to array of chars and print chars
d) convert string to uppercase and lowercase and print
e) take 2 strings and check if they are equal (create 2 strings directly in
main())
f) take 2 strings and check which is bigger or lesser (alphabetical
comparison)
g) take 2 strings and find out if one string occurs in other. Print the first
occurring index */

public class Question6
{
	public static void main(String[] args)
	{
		String str ="abcdef";
		//a
		System.out.println(str.length());
		//b
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			System.out.println(c);
		}
		//c
		char[] cr = str.toCharArray();
		System.out.println(cr);
		//d
		String str1 = str.toUpperCase();
		System.out.println(str1);
		String str2 = str.toLowerCase();
		System.out.println(str2);
		//e
		boolean b = str1.equals(str2);
		System.out.println(b);
		//f
		int n = str1.compareTo(str2);
		if(n>0)
		System.out.println(str1+"is > "+str2);
		if(n<0)
		System.out.println(str1+"is < "+str2);
		//g
		String ss  = str.substring(0,3);
		int in = ss.indexOf(str);
		System.out.println(in);
	}
}
	
