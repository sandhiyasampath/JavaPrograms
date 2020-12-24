import java.util.HashSet;
import java.util.Set;

public class Part2Question3 {
	public static void main(String[] args) {
		Part2Question2 p1 = new Part2Question2("R15", 1500);
		Part2Question2 p2 = new Part2Question2("R15", 1500);
		Part2Question2 p3 = new Part2Question2("Royal", 2000);

		Set<Part2Question2> s = new HashSet<Part2Question2>();
		System.out.println(s.add(p1));
		System.out.println(s.add(p2));
		System.out.println(s.add(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

	}
}
