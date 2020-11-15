 /*17)WAP to test whether 2 numbers given as inputs contains the same digits, for ex: 121,
112, 211 contain the same digits.!*/
import java.util.Arrays;

public class SameDigits
{
	public static void main(String[] args)
	{
		whetherGivenTwoNumbersContainsSameDigit(121,1112);
	}
	public static void whetherGivenTwoNumbersContainsSameDigit(int num1,int num2)
	{
	String str1 = String.valueOf(num1);
	String str2 = String.valueOf(num2);
	char[] cr1 = str1.toCharArray();
	char[] cr2 = str2.toCharArray();
	Arrays.sort(cr1);
	Arrays.sort(cr2);
	str1 = Arrays.toString(cr1);
	str2 = Arrays.toString(cr2);


	if(str1.equals(str2))
	{
		System.out.println("given two input contains same digits");
	}
	else
	{
		System.out.println("given two input are not contains same digits");
	}
	}
}	
	
	
