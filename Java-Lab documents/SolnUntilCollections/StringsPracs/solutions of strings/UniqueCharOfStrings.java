
package uttara.solutions.strings;
//WAM to print only the unique chars in a given string
public class UniqueCharOfStrings {

	static char c;
	public static void main(String[] args)
	{
		String input="abcdda";
        String s1=input;

      char[] ch=s1.toCharArray();
      int len=ch.length;
      for(int i=0;i<len;i++)
      {
    	  for(int j=i+1;j<len;j++)
    	  {
    		  if(ch[i]==ch[j])
    		  {
    			  System.out.println("inside if loop");
    			  s1=s1.replace(ch[i],c); //replacing with default value of char
    		  }
    	  }


      }
      s1=s1.trim();
     System.out.println("Unique character in "+input+" is "+s1);

	}

}
