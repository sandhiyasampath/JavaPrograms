package uttara.solutions.strings;
/*
 * WAM to swap first and last chars of a passed string and return it.
	char at length-1  + substring from 1, length-1 + char at 0

	str.charAt(str.length()-1) + str.substr(1,str.length()-1) +str.charAt(0)
 */
public class SwapFirstLast {

   public static void main(String[] args)
	{
		String str="abcd";
		String swaped=str.charAt(str.length()-1) + str.substring(1,str.length()-1) +str.charAt(0);

		System.out.println(str+" after swapping first and last ltr "+swaped);
	}

}
