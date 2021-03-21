package uttara.solutions.Interface;

public class StrImpl1 implements StringReverser {

	@Override
	public String revereString(String k) {
		String temp="";
		for(int i=k.length()-1;i>=0;i--)
		{
			temp=temp+k.charAt(i);
		}
		
		return temp;
	}

}
