package inheritence;

public class Vet {
public void treat(Animal a)
{
	a.sleep();
	a.eat();
	a.dance();
	if(a instanceof Hippo)
	{
		Hippo h=(Hippo)a;
		h.smoke();
	}
	if(a instanceof Croc)
	{
		Croc c=(Croc)a;
		c.swim();
	}
}
}
