package uttara.solutions.strings;
//WAM to test swapping of 2 int nums without temp var
public class SwapNumber {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		//by using temp varaible
		/*int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1 is "+num1 +" and num2 is "+num2);*/
		System.out.println("num1 is "+num1 +" and num2 is "+num2);
		//by using the Arithmetic operation
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after swaping using Arithmatic operation "+"num1 is "+num1 +" and num2 is "+num2);

		//By using the xor operation
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;

		System.out.println("after swaping using XOR operation "+"num1 is "+num1 +" and num2 is "+num2);
	}

}
