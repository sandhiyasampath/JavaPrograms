package uttara.solutions.Collection2;

public class Student implements Comparable {
	String name;
	int id;
	int age;
	public Student() {
		super();
		
	}
	
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public int hashCode()
	{
		System.out.println("inside of hashcode");
		return (name+id+age).hashCode();
	}
	public boolean equals(Object o)
	{ System.out.println("Student->equals()->testing…");
	
      if(o instanceof Student)
      {
    	  Student v=(Student)o;
    	 
    	  if(this.name.equals(v.name)&&(this.id==v.id)&&(this.age==v.age))
    	  {
    		  return true;
    	  }
    	  else
    		  return false;
      }
      else
    	  throw new IllegalArgumentException("plz pass only student object to compare");
    }
	

	public  int compareTo(Object o) {
		if(o instanceof Student)
		{
			Student v=(Student)o;
			return this.name.compareTo(v.name);
			
		}
		else
			throw new IllegalArgumentException("plz pass only Student object to comapare");
		
	}

}
