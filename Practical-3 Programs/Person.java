/* 4) There are Persons. A person has a age, name. Persons can eat,
sleep. A person sleeps more if his age is < 40 and eats less. If thepersons age is >= 40, he sleeps less but eats more. Design a Person
class and test it.
Person
String name;
int age;
public void eat() {
if(age < 40)
sdfsdkf
else
adfkgldafgk
}
public void sleep() {
....
}

*/
public class Person
{
	private int age	;
	private String name;
	public void setName(String s)
	{
		if(s=="null" || s==null || s.length()==0)
		{
			System.out.println("give a valid name");
		}
		else
		{
			name = s;
		}
	}
	public String getName()
	{
		return name;
	} 
	public void setAge(int i)
	{
		if(i<0)
		{
			System.out.println("give a valid age");
		}
		else
		{
			age = i;
		}
	}
	public int getAge()
	{
		return age;
	} 
	public void eat()
	{
		if(age<40)
		{
			System.out.println("i am a person "+ name + " eating leass than others and my age is "+age);
		}
		if(age>=40)
		{
			System.out.println("i am a person "+ name + " eating more than others and my age is "+age);
		}
	
	}
	public void sleep()
	{
		if(age<40)
		{
			System.out.println("i am a person "+ name + " sleeping more than others and my age is "+age);
		}
		if(age>=40)
		{
			System.out.println("i am a person "+ name + " sleeping less than others and my age is "+age);
		}
	
	}
}

