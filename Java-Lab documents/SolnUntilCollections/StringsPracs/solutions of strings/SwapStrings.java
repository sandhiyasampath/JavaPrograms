package uttara.solutions.strings;
//WAM to test swapping of 2 strings without temp variable
public class SwapStrings {


	public static void main(String[] args)
	{

		String s1="summer";
		String s2="winter";
		System.out.println("before swapping s1="+s1+" and s2= "+s2);
		//by using temp
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("after swapping using temp variable s1="+s1+" and s2="+s2);

		//swap by adding the strings
		System.out.println("swapping by adding the Strings....................");
		System.out.println("before swapping s1="+s1+" and s2= "+s2);
		s1 = s1+s2; //summerwinter
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s1.length()-s2.length(),s1.length());
        System.out.println("after swapping variable s1="+s1+" and s2="+s2);

        //swap using XOR operations works if two Strings are equal in length.
        System.out.println("before swapping s1="+s1+" and s2= "+s2);

    	char[] ca1 = s1.toCharArray(); //converting to CharArray.
    	char[] ca2 = s2.toCharArray();

    	for(int i = 0; i < ca1.length ; i++)
    	{
    		ca1[i] = (char)(ca1[i] ^ ca2[i]);
    		ca2[i] = (char)(ca1[i] ^ ca2[i]);
    		ca1[i] = (char)(ca1[i] ^ ca2[i]);

    	}
    	s1 = new String(ca1);
    	s2 = new String(ca2);
    	System.out.println("after swapping variable s1="+s1+" and s2="+s2);

    //------------two String are not equal length-----------------------//
    	 /* String s2="wxyzyiuyiy";
		  String s1="abcdef";
		  int len1=s1.length();
		  int len2=s2.length();
		  if(len1>len2)
		  {
			  for(int i=len2;i<len1;i++)
			  {
			     s2=s2+" ";
		      }
		  }
		  else if(len2>len1)
		  {

			  for(int i=len1;i<len2;i++)
			  {
			     s1=s1+" ";
		      }
		  }
		  System.out.println("before swapping s1="+s1.trim()+" and s2= "+s2.trim());

	    	char[] ca1 = s1.toCharArray(); //converting to CharArray.
	    	char[] ca2 = s2.toCharArray();

	    	for(int i = 0; i < ca1.length ; i++)
	    	{
	    		ca1[i] = (char)(ca1[i] ^ ca2[i]);
	    		ca2[i] = (char)(ca1[i] ^ ca2[i]);
	    		ca1[i] = (char)(ca1[i] ^ ca2[i]);

	    	}
	    	s1 = new String(ca1);
	    	s1=s1.trim();
	    	s2 = new String(ca2);
	    	s2=s2.trim();    //trim() used for removing the white spaces
	    	System.out.println("after swapping variable s1="+s1+" and s2="+s2);*/
	}

}
