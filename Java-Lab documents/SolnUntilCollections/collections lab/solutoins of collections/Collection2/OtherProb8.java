/* Test how to sort List of Persons, based on age*/

package uttara.solutions.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OtherProb8 {

	public static void main(String[] args) {
		Peru p1=new Peru(34);
		Peru p2=new Peru(12);
		Peru p3=new Peru(23);
		Peru p4=new Peru(10);

List<Peru> p=new ArrayList<Peru>();

		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);


		System.out.println("before Sorting -------->"+p);
		Collections.sort(p);
		System.out.println("After Sorting------------>"+p);

	}

}
class Peru implements Comparable<Peru>
{
	int age;

	public Peru() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peru(int age) {
		super();
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Peru other = (Peru) obj;
		if (age != other.age)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peru [age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Peru p) {

		return this.age-p.age;
	}


}
