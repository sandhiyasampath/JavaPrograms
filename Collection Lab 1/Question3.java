import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Question3 {
	public static void main(String[] args) {
	//	Collection<String> col1 = new ArrayList<String>();
		Collection<String> col1 = new HashSet<String>();
		Collection<String> col = new LinkedList<String>();

		String s1 = "one";
		String s2 = "two";
		String s3 = "three";
		String s4 = "four";
		String s5 = "five";
		String s6 = "six";
		String s7 = "seven";
		String s8 = "six";

		col.add(s1);
		col.add(s2);
		col.add(s3);
		col.add(s4);
		col.add(s5);
		col.add(s6);
		col.add(s8);
		
		col1.add(s2);
		col1.add(s3);
		col1.add(s4);
		col.addAll(col1);


		System.out.println(col);
		System.out.println(col.contains(s6));
		System.out.println(col.containsAll(col1));
		System.out.println(col.remove(s7));
		System.out.println(col.remove(s6));
		System.out.println(col.retainAll(col1));
		System.out.println(col.size());
		System.out.println(col1);
		
		for(String o:col) {
			System.out.println(o);
		}


		
	}
}
