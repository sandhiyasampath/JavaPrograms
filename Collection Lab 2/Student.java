
public class Student implements Comparable<Student>{
	String name;
	int id;
	int age;
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public int compareTo(Student s) {
		System.out.println("Students compareTo exicuted");
		return this.age-s.age;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Students equals exicuted");
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(this.name.equals(s.name) && this.age==s.age && this.id==s.id)
				return true;
			else
				return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("Students hashCode exicuted");
		return (name+age+id).hashCode();
	}
	@Override
	public String toString() {
		System.out.println("Students toString exicuted");
		return ("Student : "+name+","+id+","+age).toString();
	}

}
