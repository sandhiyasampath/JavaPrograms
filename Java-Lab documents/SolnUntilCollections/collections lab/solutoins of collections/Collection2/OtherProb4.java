 /*Test how to sort Person based on age*/

package uttara.solutions.Collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class OtherProb4 {

	public static void main(String[] args) {

		Personu p1=new Personu("datta",24);
		Personu p2=new Personu("sachin",22);
		Personu p3=new Personu("nitish",23);
		Personu p4=new Personu("krisha",34);
		Personu p5=new Personu("aady",70);
		Personu p6=new Personu("xcv",12);
		Personu p7=new Personu("fgh",3);




	      // Tree Set....
	      TreeSet <Personu>treeSet = new TreeSet<Personu>();
	      treeSet.add(p1);                                           // we have to use comparableInterface...
	      treeSet.add(p2);
	      treeSet.add(p3);
	      treeSet.add(p4);
	      treeSet.add(p5);
	      treeSet.add(p6);
	      treeSet.add(p7);
	      System.out.println(treeSet);


		}

}
class Personu implements Comparable<Personu>
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Personu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Personu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personu other = (Personu) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Personu [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Personu p) {

		return this.age-p.age;                // comparing based on age...
	}


}

