/*Write a main() method program to generate and catch an
ArrayIndexOutOfBoundsException. Test it without try catch. Code try..catch to catch this
exception and print the stack trace. First have specific catch
ArrayIndexOutOfBoundsException. Also have a SOP outside the try..catch.Is this
executed? How come? Then replace the catch parameter to RuntimeException and see if
the code still works. Change it to Exception and Throwable as well and see if it works. If
the stack trace is printed when you do not have try..catch at all, why do we need try catch then?*/
package uttara.solutions.exception;

public class Question1 {

	public static void main(String[] args) {
		/*..............................*/
		int[] a=new int[2];
		System.out.println(a[2]);//trying to acces the third element
		/*...............................*/




		/*..............................*/
		try
		{
			int[] a1=new int[2];
			System.out.println(a1[2]);
		}


		catch(ArrayIndexOutOfBoundsException e)//catching the exception
		{
			e.printStackTrace();
			System.out.println("inside the catch block"+e.getMessage());
		}
		/*..............................*/



		/*..............................*/
		try
		{
			int[] a2=new int[2];
			System.out.println(a2[2]);
		}
		//System.out.println("outside the tryblock");//soon after tryblock should emded with catch or finally block mandatory


		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("outside the catch block");
		/*..............................*/





		/*..............................*/
		try
		{
			int[] a3=new int[2];
			System.out.println(a3[2]);
		}


		catch(RuntimeException e)//DOING GENERIC CATCH ,ArrayIndexOutOfBoundsException is a RuntimeException hence we can do this
		{
			e.printStackTrace();
			System.out.println("inside the catch block");
		}

		/*..............................*/












		/*..............................*/

	    try
		{
			int[] a4=new int[2];
			System.out.println(a4[2]);
		}


		catch(Exception e)// doing generic catch
		{
			e.printStackTrace();
			System.out.println("inside the catch block");
		}
	    /*..............................*/




	    /*..............................*/
		try
		{
			int[] a5=new int[2];
			System.out.println(a5[2]);

		}


		catch(Throwable e)//doing generic catch
		{
			e.printStackTrace();
			System.out.println("inside the catch block");
		}
		/*..............................*/

		//the stack trace is printed when you do not have try..catch at all, why do we need try catch anwer is without try catch if an exception raised then it will crash the program,where as not in the case of try and catch it will handle the exception and the program flow will be normal

	}

}
