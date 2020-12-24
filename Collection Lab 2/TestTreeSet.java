import java.util.Collection;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		String s1 = "one";
		String s2 = "two";
		String s3 = "three";
		String s4 = "four";
		String s5 = "five";
		String s6 = "six";
		String s7 = "seven";
		String s8 = "eight";
		String s9 = "nine";
		String s10 = "ten";
		
		StringLengthComparator slc = new StringLengthComparator();
		Collection<String> col = new TreeSet<String>(slc);
		col.add(s1);
		col.add(s2);
		col.add(s3);
		col.add(s4);
		col.add(s5);
		col.add(s6);
		col.add(s7);
		col.add(s8);
		col.add(s9);
		col.add(s10);
		System.out.println(col);

	}
}
