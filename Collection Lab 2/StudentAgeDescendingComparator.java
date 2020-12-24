import java.util.Comparator;

public class StudentAgeDescendingComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.age-s2.age>0)
			return -1;
		else if(s1.age-s2.age<0)
			return 1;
		else
			return 0;
	}

}
