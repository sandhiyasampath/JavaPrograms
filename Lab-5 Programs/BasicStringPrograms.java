/* 12) Basic String programs(all main() based programs):
a) Create a String object using new operator and using a string literal and print out its
value using SOP to the console
b) Create a String and print out its length to the console using SOP
c) Take the input of a string from the command line (arg[0]) and print "You have a good
name, <name concatenated>!" if the length of the string is < 12 chars and "You have a
very long name, <name concatenated>!" if the length of the name is >=12 chars. If no
input has been given, show an appropriate error message.
d) Take a string input from arg[0]. Print the chars one at a time to the console.
e) Take a string input from arg[0]. Print the even chars only.
f) Take a string input from arg[0]. Print the alternate chars in one line and the remaining in
another.
g) Take string inputs from arg[0], arg[1]. Print "equal" if they have the same contents or
"not equal" if they are not.
h) Take string inputs from arg[0], arg[1]. Print whichever string is bigger than the other
alphabetically
i) Take string inputs from arg[0], arg[1]. Find out if arg[1] is present in arg[0] string and print
if the search succeeds.
j) Take string inputs from arg[0], arg[1]. Convert their cases and print them to the console. */

public class BasicStringPrograms
{
	public static void main(String[] args)
	{
		//a) Create a String object using new operator and using a string literal and print out its value using SOP to the console
		String s1 = new String("Sandhiya");
		String s2 = "sampath";
		System.out.println(s1 + " "+s2);
		System.out.println("---------------------");
		//b) Create a String and print out its length to the console using SOP
		System.out.println(s1.length());
		System.out.println("---------------------");
		/* c) Take the input of a string from the command line (arg[0]) and print "You have a good
		name, <name concatenated>!" if the length of the string is < 12 chars and "You have a
		very long name, <name concatenated>!" if the length of the name is >=12 chars. If no
		input has been given, show an appropriate error message.*/
		if(args[0].length()==0)
			System.out.println("Please give a name through command line");
		else if(args[0].length()<12)
			System.out.println("you have a good name "+args[0]);
		else if(args[0].length()>=12)
			System.out.println("you have a very long name "+args[0]);
		System.out.println("---------------------");
		//d) Take a string input from arg[0]. Print the chars one at a time to the console.
		for(int i = 0; i<args[0].length(); i++)
		{
			char c = args[0].charAt(i);
			System.out.println(c);
		}
		System.out.println("---------------------");
		//e) Take a string input from arg[0]. Print the even chars only.
		for(int i = 0; i<args[0].length(); i+=2)
		{
			char c = args[0].charAt(i);
			System.out.println(c);
		}
		System.out.println("---------------------");
		//f) Take a string input from arg[0]. Print the alternate chars in one line and the remaining in another.
		for(int i = 0; i<args[0].length(); i+=2)
		{
			char c = args[0].charAt(i);
			System.out.println(c);
		}
		for(int j = 1; j<args[0].length(); j+=2)
		{
			char c = args[0].charAt(j);
			System.out.println(c);
		}
		System.out.println("---------------------");
		//g) Take string inputs from arg[0], arg[1]. Print "equal" if they have the same contents or "not equal" if they are not.
		if(args[0].equals(args[1]))
		{
			System.out.println(" you repeated the same word");		
		}
		else
		{
			System.out.println(" you have not repeated the same word");
		}
		System.out.println("---------------------");
		//h) Take string inputs from arg[0], arg[1]. Print whichever string is bigger than the other alphabetically
		if(args[0].compareTo(args[1])>0)
		{
			System.out.println(args[0]+" is greater than "+args[1]);
		}
		if(args[0].compareTo(args[1])<0)
		{
			System.out.println(args[0]+" is lesser than "+args[1]);
		}
		if(args[0].compareTo(args[1])==0)
		{
			System.out.println(args[0]+" is equal to "+args[1]);
		}
		System.out.println("---------------------");
		//i) Take string inputs from arg[0], arg[1]. Find out if arg[1] is present in arg[0] string and print if the search succeeds.
		if(args[0].contains(args[1]))
		{
			System.out.println(args[0]+" contains "+args[1]);
		}
		else
		{
			System.out.println(args[0]+" is not contains "+args[1]);
		}
		System.out.println("---------------------");
		//j) Take string inputs from arg[0], arg[1]. Convert their cases and print them to the console.
		String s = args[0].toUpperCase();
		String ss = args[1].toUpperCase();
		System.out.println(s);
		System.out.println(ss);
	}
}
