/* 7) Basic String programs(all main() based programs):
a) Create a String object using new operator and using a string literal
and print out its value using SOP to the console
b) Create a String and print out its length to the console using SOP
c) Take the input of a string from the command line (arg[0]) and print
"You have a good name, <name concatenated>!" if the length of the
string is < 12 chars and "You have a very long name, <nameconcatenated>!" 
if the length of the name is >=12 chars. If no input has
been given, show an appropriate error message.
d) Take a string input from arg[0]. Print the chars one at a time to the
console.
e) Take a string input from arg[0]. Print the even chars only.
f) Take a string input from arg[0]. Print the alternate chars in one line and
the remaining in another.
g) Take string inputs from arg[0], arg[1]. Print "equal" if they have the
same contents or "not equal" if they are not.
h) Take string inputs from arg[0], arg[1]. Print whichever string is bigger
than the other alphabetically
i) Take string inputs from arg[0], arg[1]. Find out if arg[1] is present in
arg[0] string and print if the search succeeds.
j) Take string inputs from arg[0], arg[1]. Convert their cases and print
them to the console. */

public class Question7
{
	public static void main(String[] args)
	{
	//a
	String s1 = new String("abcdef");
	String s2 ="ghijklm";
	System.out.println(s1+" "+s2);
	//b
	System.out.println(s1.length());
	//c
	if(args[0].length()<12)
	System.out.println("you have a good name");
	if(args[0].length()>12)
	System.out.println("you have a lengthy name");
	if(args[0].length()==0)
	System.out.println("give a valid name");
	//d
	for(int i=0; i<args[0].length(); i++)
	{
	char c = args[0].charAt(i);
	System.out.println(c );
	}
	//e
	for(int j=1; j<args[0].length(); j+=2)
	{
	char cc = args[0].charAt(j);
	System.out.println(cc );
	}
	//g
	boolean boo = args[0].equals(args[1]);
	System.out.println(boo);
	//h
	boolean b = args[0].equals(args[1]);
	System.out.println(b );
	int ii = args[0].compareTo(args[1]);
	if(ii<1)
	System.out.println(args[0]+" is lesser than "+args[1]);
	if(ii>1)
	System.out.println(args[0]+" is greater than "+args[1]);
	//i
	boolean bb = args[0].contains(args[1]);
	System.out.println(bb);
	//j
	System.out.println(args[0].toUpperCase ());
	System.out.println(args[0].toLowerCase());
	}
	
	
}

