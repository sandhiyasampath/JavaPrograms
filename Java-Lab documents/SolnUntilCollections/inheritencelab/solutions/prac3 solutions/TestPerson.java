/*4) There are Persons. A person has a age, name. Persons can eat,
sleep. A person sleeps more if his age is < 40 and eats less. If the persons
age is >= 40, he sleeps less but eats more. Design a Person class*/

public class TestPerson
{
	public static void main(String[] args)
	{
		System.out.println("main()->starting...");
		Person p1 = new Person();
		Person p2 = new Person();
		p1.age = 20;
		p1.name = "ramu";
		p2.age = 50;
		p2.name = "shyamu";
		System.out.println("age of p1 = "+p1.age+" name of p1 = "+p1.name);
		System.out.println("age of p2 = "+p2.age+" name of p2 = "+p2.name);

		p1.dance();
		p2.dance();

		System.out.println("main()->ending...");
	}
}
