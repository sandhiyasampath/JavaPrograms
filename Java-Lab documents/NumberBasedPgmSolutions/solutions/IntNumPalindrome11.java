//11)WAP to identify if an int number is a palindrome!

package uttara.solutions.prac3;

public class IntNumPalindrome11 {

	public static void main(String[] args) {

System.out.println(isPalindrome(1199));
System.out.println(isPalindrome12(121));
	}
	public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        String reverse = "";

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse + remainder;//concating to string
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == Integer.parseInt(reverse)) {
            return true;
        }
        return false;
    }


	public static boolean isPalindrome12(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;//concating to int
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
