import java.util.Set;
import java.util.TreeSet;

public class Part2Question1 {
	public static void main(String[] args) {
		String s1 = new String("marirama");
		String s5 = new String("someshwara");
		String s2 = new String("eshwara");
		String s3 = "rameshwara";
		String s4 = "ramanuja";
		String s6 = "ramanna";
		System.out.println(s1==s5);
		Set <String> s = new TreeSet<String>();
		s.add(s1);
		s.add(s6);
		s.add(s4);
		s.add(s3);
		s.add(s2);
		s.add(s5);
		System.out.println(s);

		

	}
}
