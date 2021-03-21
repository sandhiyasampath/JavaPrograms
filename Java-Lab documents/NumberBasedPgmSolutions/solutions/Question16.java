/*16)An Armstrong number of three digits is an integer such that the sum of the cubes of its
digits is equal to the number itself. For example, 371 is an Armstrong number since
3**3 + 7**3 + 1**3 = 371. Write a program to find all Armstrong number in the range of
0 and 999.*/
package uttara.solutions.prac3;

public class Question16 {

	public static void main(String[] args) {

		int inputNumber=3479;//370,371,3479 are armstrong number
		 boolean result = isArmstrong(inputNumber);
	       if (result) {
	           System.out.println(inputNumber + " is an armstrong number");
	       } else {
	           System.out.println(inputNumber + " is not an armstrong number");
	       }

	}
	 public static boolean isArmstrong(int input) {
	       String inputAsString = input + "";
	       int numberOfDigits = inputAsString.length();
	       int copyOfInput = input;
	       int sum = 0;
	       while (copyOfInput != 0) {
	           int lastDigit = copyOfInput % 10;
	           sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
	           copyOfInput = copyOfInput / 10;
	       }
	       if (sum == input) {
	           return true;
	       } else {
	           return false;
	       }
	   }

}
