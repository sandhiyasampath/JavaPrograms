import java.util.ArrayList;
import java.util.List;

public class TestPart2Question2 {
	public static void main(String[] args) {
		Part2Question2 p1 = new Part2Question2("R15", 1500);
		Part2Question2 p2 = new Part2Question2("R15", 1500);
		System.out.println(p1.equals(p2));
		List<Part2Question2> l = new ArrayList<Part2Question2>();
		l.add(p1);
		l.add(p2);
		System.out.println(l.contains(p2));
		System.out.println(l.remove(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());


	}

}
