/*12) Create a byte variable with value 127. Add 10 to it and store in byte. Print the result. Is
the result correct? Why not?!*/

package uttara.solutions.prac1;

public class Ques12 {

	public static void main(String[] args) {
		byte b=127;
		byte c=(byte) (b+10);
		System.out.println(c);   // bcz byte range is -128 to 127

	}

}
