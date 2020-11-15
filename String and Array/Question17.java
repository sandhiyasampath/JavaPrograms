/* 17) WAM to swap first and last chars of a passed string and return it.
char at length-1 + substring from 1, length-1 + char at 0
str.charAt(str.length()-1) + str.substr(1,str.length()-1) +str.charAt(0). */
public class Question17
{
	public static void main(String[] args)
	{
	swapingNumbers("sandhiya");
	}
	public static void swapingNumbers(String s)
	{
	char[] ca = s.toCharArray();
	for(int i=0; i<ca.length/2; i++)
	{
		char temp = ca[i];
		ca[i] = ca[ca.length-1-i];
		ca[ca.length-1-i] = temp; 
	}
		String r = new String(ca);
		System.out.println(r);
	}
	
}
