/*Create a class Test. Create a method named process that accepts an int as a
parameter. Create a main method. Create a int variable x with value 10. Print the value of
x to monitor using SOP. Then invoke process() and pass x as a parameter. Print the value
in process(). Change the value in process(). Print the value in main() after invoking
process(). Are you understanding the control flow? Are you understanding how parameters
are being passed?!*/
package uttara.solutions.prac1;

public class Ques26 {
	public static void x()
	{
		int c=30;
		y();
	}
                                       // we can't access one method local variables in another...
	public static void y() {          // local variables are stored in stack....
		int b=20;

	}

	public static void main(String[] args) {
		int a=10;
		x();
		Test2.z();         // calling Z() method here


	}

}
class Test2
{
	public static void z()
	{
		System.out.println("in class Test2 and method Z()");
	}

}
