/*WAP to return true if an int input contains all the digits in increasing order (ex: 123 ->
true, 12342->false)*/
package uttara.solutions.prac3;

public class TestIncreaingDigit19 {

	public static void main(String[] args) {
		System.out.println(increasingDigits(12223));
	}

	public static boolean increasingDigits(int input)
	{
	    // Deal with negative inputs...
	    if (input < 0)
	        input = -input;

	    int lastSeen = 10; // always greater than any digit
	    int current;

	    while (input > 0) {
	        current = input % 10;//getting the last digit
	        if (lastSeen < current)
	            return false;
	        lastSeen = current;
	        input /= 10;
	    }
	    return true;
	}

}
