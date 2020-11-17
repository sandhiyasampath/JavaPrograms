/* 3) Create a class Person. A Person has a name and age. Design an immutable class for Person. Create an object in tester class and
verify if you can change the state of the person.(Remember: Immutable class design = final class with final inst
variable with parameterized constructors) */
package InterfaceLab;
public final class Person
{
	public final String NAME;
	public final int AGE;
	public Person(String personName,int personAge)
	{
		NAME = 	personName;
		AGE = personAge;
	}
	
}
class TestPerson
{
	public static void main(String[] args)
	{
		Person p =new Person("sandhoya ",20);
		System.out.println("name = "+p.NAME +"age = "+p.AGE);
	}
}
