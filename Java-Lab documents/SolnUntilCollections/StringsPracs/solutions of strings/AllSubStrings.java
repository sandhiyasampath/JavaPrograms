package uttara.solutions.strings;
//WAP to print all the substrings of a string
public class AllSubStrings {

	public static void main(String[] args)
	{
	   String s="abcd";
	   int len=s.length();
	   System.out.println("all possible subString of "+s+" is bellow");
	   for(int i=0;i<=len;i++)
	      {
	    	  for(int j=i+1;j<=len;j++)
	    	  {
	    		  String x=s.substring(i,j);
	    		  System.out.println(x);


	    	  }


	      }

	}

}
