package uttara.solutions.Interface;

public class StrImpl3 implements StringReverser {

	@Override
	public String revereString(String k) {
		String temp="";
		
		for(int i=0;i<k.length();i++)
		{
			temp=k.charAt(i)+temp;
		}
		return temp;
	}

}
