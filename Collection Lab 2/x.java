public class x {
	public static void main(String[] args) 
	{
	}
		String str = "madam madam sandhiya";
		int count = 0;
		String[] words = str.split(" ");
		for(String s:words) { 
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		String str2 = sb.toString();
		if(s.equals(str2))
			count++;
		System.out.println(count);
	}
	}

}
