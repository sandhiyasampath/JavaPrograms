import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Teerkkavan",1, 1);
		Student s2 = new Student("abhinaya",2, 25);
		Student s3 = new Student("abirami",3, 23);
		Student s4 = new Student("sandhiya",4, 22);
		Student s5 = new Student("balaji",5,29);
		Student s6 = new Student("sandhiya",4, 22);
		StudentNameComparator snc = new StudentNameComparator();
		StudentAgeDescendingComparator sadc = new StudentAgeDescendingComparator();
		List<Student> l = new ArrayList<Student>();
		System.out.println(l.add(s1));
		System.out.println(l.add(s2));
		System.out.println(l.add(s3));
		System.out.println(l.add(s4));
		System.out.println(l.add(s5));
		System.out.println(l.add(s6));
		
		/* System.out.println("----------------------------------");
		Set<Student> l1 = new HashSet<Student>();
		System.out.println(l1.add(s1));
		System.out.println(ls1.add(s2));
		System.out.println(l1.add(s3));
		System.out.println(l1.add(s4));
		System.out.println(l1.add(s5));
		System.out.println(l1.add(s6)); */
		
		System.out.println("----------------------------------");
		Set<Student> l3 = new TreeSet<Student>(snc);
		System.out.println(l3.add(s1));
		System.out.println(l3.add(s2));
		System.out.println(l3.add(s3));
		System.out.println(l3.add(s4));
		System.out.println(l3.add(s5));
		System.out.println(l3.add(s6));
		System.out.println(l3);
		Collections.sort(l);
	}
}
