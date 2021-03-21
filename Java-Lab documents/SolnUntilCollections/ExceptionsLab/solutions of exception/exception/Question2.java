/*WAP to generate the following abnormal conditions in main():
a) NullPointerException
b) ClassCastException
c) NumberFormatException
d) OutOfStackMemoryError (invoke main() recursively) -> can you catch this as well??
e) OutOfMemoryError - heap memory -> populate heap with 1 million reachable objects.
Enable a catch block for each and see whether you are able to catch the exceptions. Print
the stack trace and verify.*/

package uttara.solutions.exception;

public class Question2 {


	public static void main(String[] args) {

/*-------------------Null Pointer Exception----------------------------------------*/
		try
		{
			String h=null;
			System.out.println(h.length());       // to get null pointer Exception......

		}
		catch(NullPointerException n)
		{
			System.out.println("Null pointer Exception--->");
		  n.printStackTrace();
		}

/*-------------------Class cast Exception----------------------------------------*/
		try
		{
			Object o=new Object();
			Prani p=(Prani)o;           // Object ( Parent ) can't be downcasted to Prani..
			                            // compile time ok..but Run time class cast exception will occur..
		}
		catch(ClassCastException c)
		{
			System.out.println("Class cast Exception----->");
			c.printStackTrace();
		}

/*-------------------Number Format Exception----------------------------------------*/
		try {
			String h="ondu";
			int hold=Integer.parseInt(h);        // insted of ondu if yu give 1 it will work...

		} catch (NumberFormatException ne) {
			System.out.println("Number Format Exception------>");
		  ne.printStackTrace();
		}







	}

}
