import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		System.out.println("s2.name= "+s2.name+"s1.name = "+s1.name);
		return s1.name.compareTo(s2.name);
	}

}
