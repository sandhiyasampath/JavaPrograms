/*Create a class Person. A Person has a name and age. Design
an immutable class for Person. Create an object in tester class and
verify if you can change the state of the person.
(Remember: Immutable class design = final class with final inst
variable with parameterized constructors)*/
package uttara.solutions.Interface;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("remo", 35);
		//p.age=90;//The final field Person.age cannot be assigned
		//p.name="radha";//he final field Person.name cannot be assigned
	}

}
