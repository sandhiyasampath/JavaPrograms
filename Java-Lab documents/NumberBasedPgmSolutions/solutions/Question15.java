//15)AP to swap 2 ints without using a temp variable
package uttara.solutions.prac3;

public class Question15 {

	public static void main(String[] args) {

		swap_int(23, 78);
	}

	public static void swap_int(int num1,int num2)
	{
		System.out.println("num1:"+num1+" num2:"+num2);// without using temp
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1:"+num1+" num2:"+num2);
	}

}
