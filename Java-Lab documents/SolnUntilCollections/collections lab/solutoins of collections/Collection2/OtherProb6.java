/* Test how to sort List of Persons*/

package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OtherProb6 {

	public static void main(String[] args) {
		Per p1=new Per("datta");
		Per p2=new Per("sachin");
		Per p3=new Per("abc");
		Per p4=new Per("kulka");

		List<Per> p=new ArrayList<Per>();

		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);

		System.out.println("Before Sorting--> "+p);
		Collections.sort(p);
		System.out.println("After sorting--->"+p);




	}

}
class Per implements Comparable<Per>
{
	String name;

	public Per() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Per(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Per other = (Per) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Per [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Per v) {

		return this.name.compareTo(v.name);
	}

}
