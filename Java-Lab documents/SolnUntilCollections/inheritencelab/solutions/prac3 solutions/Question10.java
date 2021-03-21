/*10) WAP to test whether a given input int number is a square.
first find the sqrt of the num

 then it is a square
or
if (((int)d)*((int)d) == num) then is square*/
public class Question10 {

	public static void main(String[] args) {
		
		double d = Math.sqrt(10);
		//if ((d - (int)d) == 0)
		if ((d - (int)d) == 0)
{
	System.out.println("it is square number");
}
		else
			System.out.println("it is not square number");

	}

}
