

package uttara.solutions.Collection1;

public class Person {
	String name;
	int height;
	public Person()
	{

	}
	public Person(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Person)
		{
			Person p=(Person)o;
			if(this.name.equals(p.name)&& this.height==p.height)
			{
				return true;
			}
			else
				return false;
		}
		throw new IllegalArgumentException("pass only person");
	}

	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}




}
