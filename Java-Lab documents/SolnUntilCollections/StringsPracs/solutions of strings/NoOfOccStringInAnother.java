package uttara.solutions.strings;
/*WAM to accept 2 strings as input and return number
of occurrences of second string in first*/
public class NoOfOccStringInAnother

{

	public static void main(String[] args)
	{
		
		String s="rarararamamaramarama";
		String s1="ar";
		int count=0;
		int pos=0;
		int  x=0;
		//using the indexOf(String n,int x).
		while(x!=-1)
		{
		  x=s.indexOf(s1, pos);

		  //System.out.println(x);
		  if(x!=-1)
		  {
			  count=count+1;
			pos=x+s1.length()-1;
		  }
		  else break;

		}
		System.out.println("no of occurance of"+s1+" in "+s+" is "+count);
		
		pos=s.indexOf(s1);
		while(pos>=0&&pos<s.length())
		{
			pos++;
			pos=s.indexOf(s1,pos);
			count++;                        // 2nd method
		}
		
	System.out.println(count);
		
		int m=s.split(s1).length-1;
		System.out.println(m);

	}
	
	
	
}
