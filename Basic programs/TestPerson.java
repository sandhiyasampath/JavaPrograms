public class TestPerson
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setName("sandhiya");
		p.setAge(22);
		System.out.println("name= " + p.getName() + " age= " + p.getAge());
		Person p1 = new Person();
		p1.setName("");
		p1.setAge(100);
		System.out.println("p1.getName= " + p1.getName() + " age= " + p1.getAge());
		Person p2 = new Person("abhinaya",25);
		System.out.println("p2.getName= " + p2.getName() + " age= " + p2.getAge());
		for(int i = 1; i<=100; i++)
		{
			Person pi = new Person();
		}
		System.out.println(Person.count);
		
		
	}
} 

