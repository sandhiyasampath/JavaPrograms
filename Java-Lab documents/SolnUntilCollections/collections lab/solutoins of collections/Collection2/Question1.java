/*Create two strings with same state using new operator and invoke == and .equals() on
them to verify working of object identity and object equality. Create the strings as
literals as well as using the new operator. Invoke hashCode() on both and print the
result. Are the hash codes same? Why?*/


package uttara.solutions.Collection2;

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
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());//hashcode returns same bucket number because the contents are same

	}

}



