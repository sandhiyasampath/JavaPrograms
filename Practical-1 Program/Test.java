/*Create a class Test. Create a method named process that accepts an int as a
parameter. Create a main method. Create a int variable x with value 10. Print the value of
x to monitor using SOP. Then invoke process() and pass x as a parameter. Print the value
in process(). Change the value in process(). Print the value in main() after invoking
process(). Are you understanding the control flow? Are you understanding how parameters
are being passed?*/
public class Test
{
	public static void main(String[] args)
	{
		int x = 10;
		System.out.println("Printing in main method "+x);
		process(x);
	}
	public static void process(int num)
	{
		num = 25;
		System.out.println("Printing in process method "+num);
	}
}
	
