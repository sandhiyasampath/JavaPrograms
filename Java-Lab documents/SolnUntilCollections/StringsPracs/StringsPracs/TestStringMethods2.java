public class TestStringMethods2
{
	public static void main(String[] args)
	{
		String s1 = "rasa kreedaa samaasaktha gopi vastraapaka harakaa charya";
		int l = s1.length();
		System.out.println("length = "+l);
		for(int i = 0 ; i < s1.length() ; i++)
		{
			char c = s1.charAt(i);
			System.out.println("char at "+i+" pos = "+c);	
		}
		String s2 = s1.substring(25,s1.length());
		System.out.println("s2 = "+s2);
		
		String s3 = new String("april");
		String s4 = "april";
		System.out.println("is s3 == s4 ?"+(s3==s4));
		System.out.println("is s3.equals(s4) ?"+(s3.equals(s4)));
		String s5 = "aa";
		System.out.println("is s5 present in s1 ? "+ s1.indexOf(s5,10));

		String s6 = "blue";
		String s7 = "green";
		System.out.println("comparing s6 with s7 = "+ s6.compareTo(s7));
	
		char[] ca = s6.toCharArray();
		for(char c : ca)
			System.out.println(c);
		
		String[] sarr = s1.split("aa");
		for(String x:sarr)
			System.out.println(x);
		
		
		for(int i = s1.length()-1; i>=0;i--)
		{
			System.out.print(s1.charAt(i));	
		}
	}

}




