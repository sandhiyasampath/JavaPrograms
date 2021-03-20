public class Praani
{
	String name = "jaanvar";
	
	public void eat()
	{
		System.out.println(name+" praani eating");	
	}
	public void sleep()
	{
		System.out.println(name+" praani sleeping");	
	}
}
class Camel extends Praani
{
	public void sleep()
	{
		System.out.println(name+" Camel sleeping");	
	}
	public void run()
	{
		System.out.println(name+" Camel running");	
	}
}
class Rhino extends Praani
{
	public void eat()
	{
		System.out.println(name+" Rhino eating by keeping its horn pakkak");	
	}
	public void gumm()
	{
		System.out.println(name+" Rhino smashing");	
	}
}
class Frog extends Praani
{
	public void croak()
	{
		System.out.println(name+" Frog croaking....");	
	}
}
class Parrot extends Praani
{
	public void eat()
	{
		System.out.println(name+" parrot eating....crackers");	
	}
	public void talk()
	{
		System.out.println(name+" parrot talking....nonsense");	
	}
}

class Vet 
{
	String name;
	public void treat(Praani p)
	{
		System.out.println("Vet "+name+" treating "+p.name);	
		if (p instanceof Parrot)
		{
			Parrot pa = (Parrot) p;
			pa.talk();
		}

		p.eat();
		p.sleep();
		
	}
}
class Owl extends Praani
{
	public void eat()
	{
		System.out.println(name+" Owl eating insects");	
	}
	public void sleep()
	{
		System.out.println(name+" Owl sleeping in day time and stay awake like programmer in the night time");	
	}
	public void fly()
	{
		System.out.println(name+" Owl flying");
	}
}

class TestPraani
{
	public static void main(String[] args)
	{
		Praani p = new Praani();
		Frog f = new Frog();
		f.name = "Mr.Froggy";
		
		Camel c = new Camel();
		c.name = "Mr.Oont";
		
		Rhino r = new Rhino();
		r.name = "Mr.Hulk";
		
		Vet v = new Vet();
		v.name = "Dr.Dolittle";
		
		//X child ref = parent ref/obj X
		
		v.treat(p);
		v.treat(f);
		v.treat(r);
		v.treat(c);
		Owl o = new Owl();
		v.treat(o);
		Parrot p1 = new Parrot();
		p1.name = "gini";
		v.treat(p1);
		
		
		System.out.println("is p instanceof Praani = "+(p instanceof Praani));
		System.out.println("is f instanceof Praani = "+(f instanceof Praani));
		System.out.println("is f instanceof Frog = "+(f instanceof Frog));
		System.out.println("is p instanceof Frog = "+(p instanceof Frog));
		
	}
	
}




