import java.util.ArrayList;
import java.util.Collection;

public class Question4 {
	public static void main(String[] args) {
		Question2 q = new Question2("one",10);
		Question2 q2 = new Question2("two", 20);
		Question2 q3 = new Question2("three", 30);
		Question2 q4 = new Question2("four", 40);
		Question2 q5 = new Question2("five", 50);
		Collection<Question2> col = new ArrayList<Question2>();
		System.out.println(col.add(q));
		col.add(q2);
		col.add(q3);
		col.add(q4);
		col.add(q5);
		System.out.println(col.remove(q3));
		System.out.println(col.contains(q5));


	}
}
