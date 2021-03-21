package uttara.solutions.Interface;

public class StrImpl2 implements StringReverser {

	@Override
	public String revereString(String k) {
		StringBuffer sb=new StringBuffer(k);
		sb.reverse();
		return sb.toString();
		
	}

}
