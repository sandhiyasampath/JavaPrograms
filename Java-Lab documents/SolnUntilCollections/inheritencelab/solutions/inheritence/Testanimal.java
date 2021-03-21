/*) Animals can eat,sleep and dance. Hippo,tiger,croc etc are animals. Every animal has name.
An animal snores when it sleeps. A vet can treat animals. When an animal is treated, it is made
to dance, eat and sleep. A Croc can swim, a hippo can smoke. When a Vet is given a croc, he
will make it swim as well. When he is given a hippo to treat, he will make it smoke as well.!
Test the working of Vets polymorphic code as per the steps followed in the earlier example. Put
all classes in relevant packages.!*/
package inheritence;

public class Testanimal {
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.name="uganta";
		Hippo h=new Hippo();
		Croc c=new Croc();
		Vet v=new Vet();
		v.treat(a);
		v.treat(h);
		v.treat(c);

	}

}
