/*Code a method m1() in class TestFinally. Let it return an int.

Invoke this from main() by creating an object and print the returned value from m1() to
monitor. Embed statements in main() in try..catch with printStackTrace() and a SOP. Verify
what values are printed.
a) when try succeeds b) in try…write code to raise a NullPointerException and see what
value gets printed c) in catch, create a NullPointerException and see what happens d) in
finally, create a NullPointerException and see what happens e) remove the return from
finally and re-execute scenarios a,b,c and d. What is the best practice you learn from this?*/
package uttara.solutions.exception;


public class Question4 {

	public static void main(String[] args) {
		try
		{
		Testfinally f=new Testfinally();
		int x=f.m1();
		System.out.println("the value of x"+"........>"+x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("in catch block"+e.getMessage());
		}

	}

}
//we shoud never return anything in the finally block because programs executes no mater what happened to it,thogh if an exception occurs but finally block excutes so when we return anything from finally block it will executes as if nothing has happened hence thats the best practise
