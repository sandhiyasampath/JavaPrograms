/* c) Animals can eat,sleep and dance. Hippo,tiger,croc etc are animals.
Every animal has name. An animal snores when it sleeps. A vet can
treat animals. When an animal is treated, it is made to dance, eat and
sleep. A Croc can swim, a hippo can smoke. When a Vet is given a
croc, he will make it swim as well. When he is given a hippo to treat,
he will make it smoke as well.
Test the working of Vets polymorphic code as per the steps followed in
the earlier example. Put all classes in relevant packages. */
public class Animal
{
	private String name;
	public void setName(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;
	}
	public void eat()
	{
		System.out.println("i am a animal "+name+" eating");
	}
	public void sleep()
	{
		System.out.println("i am a animal "+name+" sleeping with snoring");
	}
	public void dance()
	{
		System.out.println("i am a animal "+name+" dancing");
	}
	
}
	
