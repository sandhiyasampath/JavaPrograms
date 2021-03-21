package uttara.solutions.strings;
/*Write a main() program to test methods of string to perform the following:
		a) check its length
	    b) print all the chars in string one at a time
		c) convert string to array of chars and print chars
		d) convert string to uppercase and lowercase and print
		e) take 2 strings and check if they are equal
		f) take 2 strings and check which is bigger or lesser
		g) take 2 strings and find out if one string occurs in other*/
public class StringMethodTest {

	public static void main(String[] args)
	{

		String s1="abcd";
	    //check its length
		int len=s1.length();
		System.out.println("length of string  "+s1+"  is----"+len);

		//print all the chars in string one at a time
		System.out.println("printing the value using the chatAt()....");
		for(int i=0;i<len;i++)
			System.out.println("charecter at position "+i+ "  is "+s1.charAt(i));

		//convert string to array of chars and print chars

		 char[] ch=s1.toCharArray();
		 System.out.println("printing the value using the toCharArray()....");
		   for(int i=0;i<ch.length;i++)
		   System.out.println("character at position "+i+" is "+ch[i]);
            //using enhanced for loop(for-each)
		   System.out.println("printing the value using for-each loop");
		   for(char c:ch)
			   System.out.println(c);

		 // convert string to uppercase and lowercase and print
		  String upper=s1.toUpperCase();
		   System.out.println("upper-case of string "+s1+" is--"+upper);

		  String lower=upper.toLowerCase();
		  System.out.println("lower-case of String  "+upper+"  is----"+lower);

		 // take 2 strings and check if they are equal
		  String s2="abcd";
		  String s3="abcd";
		  System.out.println("is  "+s2+" == "+s3+" ???  "+(s2==s3));
		  System.out.println("is  "+s2+" equals() "+s3+" ???  "+s2.equals(s3));

		  String s4= new String("xyz");
		  String s5= new String("xyz");
		  System.out.println("is  "+s4+" == "+s5+" ???  "+(s4==s5));            // String identity check
		  System.out.println("is  "+s4+" equals() "+s5+" ???  "+s4.equals(s5)); //String equality check

		  //take 2 strings and check which is bigger or lesser

		  String s6="ramarama";
		  String s7="rama";
		  int x=s6.compareTo(s7);
		  if(x==0)
			  System.out.println(s6+" is equlas"+s7);
		  else if(x>0)
		    	 System.out.println(s6+"  is greater than "+s7);
		  else
		    	 System.out.println(s6+" is lesser then "+ s7);


		  //take 2 strings and find out if one string occurs in other
		  /*
		   * String s6="ramarama";
		   * String s7="rama";
		   */
		  System.out.println("is "+s7 +" occurs in "+s6+" ?? "+s6.contains(s7));
	}

}
