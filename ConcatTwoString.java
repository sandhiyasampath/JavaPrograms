/* Question: Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
Sample Input: 1. makeOutWord("<<>>", "Yay") -> <<Yay>> 2. makeOutWord("<<>>", "WooHoo") -> <<WooHoo>>
Sample Output: 3. makeOutWord("[[]]", "word") -> [[word]] */
public class ConcatTwoString
{
	public static void main(String[] args)
	{
		makeOutWord("<<>>","hehehe");
	}
	public static String makeOutWord(String out, String word)
	{
		String str1 = out.substring(0,2);
		String str2 = out.substring(2);
		String outPut = str1+word+str2;
		return outPut;
	}
}

 
