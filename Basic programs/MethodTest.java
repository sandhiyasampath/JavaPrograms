
method named public static void print(){SOP(“in print()”}. Invoke
print() method from main().Put SOPs before invoking print() and af-
ter. Execute the class and verify the working of control flow. What
SOPs are printed in what order? Do you understand this? Now put
a return; statement in print() before SOP(“in print()”); and then see if
the compilation succeeds. Why not? Put the return statement after
SOP as the last statement. Now compile and check. Why this dif-
ference in compiler output? Now change the return data type of
print() to int. Compile the code without using any return statement in
the method. Does it work? Why not? Now use return; as the last
statement. Now compile and check again. Now code return 1; as
the last statement. Do you understand that you have to return a
value when you give a return data type in the method header? Now
remove all the statements from print() and code this!
public static int print()!
{
	if(1!=2)!

}
return 1;!
Check if it compiles. What if you add will this code compile? Ask
questions to Lab Instructors if you do not understand the working of
return.!*/

public class MethodTest/*0) Code a class MethodTest. Create main(). Create one more static
{
	public static void main(String[] args)
	{
		print();
	}
	public static int print()
	{

	System.out.println("in print()");
	if(1!=2)
	}
		return 1;
	}
}
