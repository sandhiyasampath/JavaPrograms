/*16)An Armstrong number of three digits is an integer such that the sum of the cubes of its
digits is equal to the number itself. For example, 371 is an Armstrong number since
3**3 + 7**3 + 1**3 = 371. Write a program to find all Armstrong number in the range of 0 and 999.!*/

/* armstrong number - An Armstrong number is a number such that the sum ! of its digits raised to the third power is equal to the number ! itself. For example, 371 is an Armstrong number, since !*/

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		armstrongNumberOfGivenNumberIs(152);
	}
	public static void armstrongNumberOfGivenNumberIs(int input)
	{
	int copyOfInput = input;
	int armstrongNumber = 0;
	int lastDigit = 0;
	String str = String.valueOf(copyOfInput);
	while(copyOfInput!=0)
	{
		lastDigit = copyOfInput%10;
		armstrongNumber = (int)(Math.pow(lastDigit,str.length()))+armstrongNumber;
		copyOfInput = copyOfInput/10;
	}

	if(input==armstrongNumber)
	{
		System.out.println(armstrongNumber+" is Armstrong number");
	}
	else
	{
		System.out.println(armstrongNumber+" is not a armstrong number");
	}
	}
}
