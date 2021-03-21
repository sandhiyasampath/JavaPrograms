/*Create a Person. A person has a name and an age (int). Code correct setter/getter
methods with validations and test. Remember all setter and parameterised constructors
must validate the invokers input and raise IllegalArgumentException if there is a validation
failure.
Create a Tester class, create a person object, set a bad age and see when you execute,
are you getting the IllegalArgumentException or not? Do you understand why we should
raise exceptions for validations?
*/

package uttara.solutions.exception;

public class Question6 {                         // As Tester Class...
	public static void main(String[] args) {
		Person p=new Person("hey hello",-1);  // any inputs u can giv here....

	}


}
class Person
{
   String name;
   int age;

   public Person() {
	   System.out.println("non arg");
  }


  public Person(String name, int age) {
	super();
	if(name==null||name.equals(""))
	{
		throw new IllegalArgumentException("Task name should not be blank or null");
	}
	if(name.split(" ").length>1)
	{
		throw new IllegalArgumentException("multiple words are not allowed");
	}
	else

	{
	this.name = name;
	}
	if(age < 0 || age > 100)
	{
		throw new IllegalArgumentException("Is this person born or is he already dead?");
	}
	else
	{
	this.age = age;
	}
}



public String getName() {
	return name;
}
public void setName(String name) {
	if(name==null||name.equals(""))
	{
		throw new IllegalArgumentException("Task name should not be blank or null");
	}
	if(name.split(" ").length>1)
	{
		throw new IllegalArgumentException("multiple words are not allowed");
	}
	else

	{
	this.name = name;
	}
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age < 0 || age > 100)
	{
		throw new IllegalArgumentException("Is this person born or is he already dead?");
	}
	else
	{
	this.age = age;
	}
}

// Adding functionlity dance here..(for 7th ques)
public void dance(String typofdance) throws DanceFailureException
{
	if(this.age>50&&typofdance.equals("salsa"))
		throw new DanceFailureException("person is not dancing ---->");

}


}


