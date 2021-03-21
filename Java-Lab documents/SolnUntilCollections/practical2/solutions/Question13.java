/*13)WAP to generate: !
a) the binary number representation for an int number!
b) the hexadecimal representation for an int number!
c) the octal representation for an int number!
d) base10 representation for an octal input!
e) base10 representation for a hexadecimal input!
f) base10 representation for a binary input!*/

package uttara.solutions.prac3;

public class Question13 {
public static void main(String[] args) {
	int i=10;
	System.out.println(Integer.toBinaryString(i));//a) the binary number representation for an int number
	System.out.println(Integer.toHexString(i));//the hexadecimal representation for an int number
	System.out.println(Integer.toOctalString(i));// the octal representation for an int number


	System.out.println(Integer.toString(i, 8));//base10 representation for an octal input
	System.out.println(Integer.toString(i, 16));//base10 representation for a hexadecimal input
	System.out.println(Integer.toString(i, 2));//base10 representation for a binary input

}
}
