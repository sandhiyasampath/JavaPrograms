import java.util.HashSet;
import java.util.Set;

public class TestQuestion2 {
	public static void main(String[] args) {
		Question2 q1 = new Question2("sandhiya", 145);
		Question2 q2 = new Question2("abhinaya", 160);
		Question2 q3 = new Question2("abirami", 140);
		Question2 q4 = new Question2("deergavan", 30);
		Question2 q5 = new Question2("sandhiya", 145);

		System.out.println(q1);
		System.out.println("identity check = " + (q1==q5));
		System.out.println(".equals check = "+(q1.equals(q5)));
		Set<Question2> s = new HashSet<Question2>();
		s.add(q1);
		s.add(q2);
		s.add(q3);
		s.add(q4);
		s.add(q5);
		System.out.println(s);

	}
}
