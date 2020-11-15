/* 18)
In main()->
String str = “blah”;
str.toUpperCase();
SOP(str); what is printed and why?
str = “ blah “;
SOP(str.trim()); //after this, print its length.
String s1 = new String(“abc”); // how many objects are getting created and where?
String s2 = new String(“abc”); // how many objects are getting created and where?
SOP(s1==s2); // do you understand the output?
SOP(s1.equals(s2)); // do you understand the output?
String s3 = “abc”;SOP(s1==s3); // do you understand the output?
SOP(s1.equals(s3)); // do you understand the output?
String s4 = “abc”;
SOP(s3==s4); // do you understand the output?
SOP(s3.equals(s4)); // do you understand the output? */

public class SomeStringMethods
{
	public static void main(String[] args)
	{
		String s1 = "  blah  ";
		s1.toUpperCase();
		System.out.println(s1.length());
		System.out.println(s1);
		s1 = s1.trim();
		System.out.println(s1);
		System.out.println(s1.length());
		String s2 = new String("abcd");
		String s3 = new String("abcd");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		String s4 = "abcd";
		String s5 = "abcd";
		System.out.println(s4.equals(s3));
		System.out.println(s4==s5);
	}
}
