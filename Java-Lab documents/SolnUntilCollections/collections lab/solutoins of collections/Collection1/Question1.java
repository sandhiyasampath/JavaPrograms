/*WAP to compare 2 strings by == and .equals() and test whether
Strings .equals() works correctly. Which equals() implementation is getting
picked up?*/

package uttara.solutions.Collection1;

public class Question1 {

	public static void main(String[] args) {
		String s1="loki";
		String s2="loki";
		System.out.println(s1==s2);//literals hence point to the same object hence return true
		System.out.println(s1.equals(s2));//picks String class equals method
		String s3=new String("God");
		String s4=new String("God");

		System.out.println(s3==s4);//when we use new keyword it wii create an object hence returns false
		System.out.println(s3.equals(s4));//checks with equality of contents


	}

}
