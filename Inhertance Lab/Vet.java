public class Vet
{
	public void treat(Animal a)
	{
		if(a instanceof Hippo)
		{
			Hippo h = (Hippo)a;
			h.eat();
			h.dance();
			h.sleep();
			h.smoke();
		}
		else if(a instanceof Croc)
		{
			Croc h = (Croc)a;
			h.eat();
			h.dance();
			h.sleep();
			h.swim();
		}
		else
		{
			a.eat();
			a.sleep();
			a.dance();
		}
	}
}
