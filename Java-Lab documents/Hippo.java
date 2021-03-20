/*
There are Hippos. A hippo can eat and dance. A hippo has size. If the size of the hippo is < 10, then hippo will do break dance and >= 10, it will do snake dance. A hippo will eat whatever food name that is given to it. It will eat slowly if its size is > 40 and and east faster if size <= 40. Design and test hippos!!! 

	Hippo
		int size;
		public void dance()
		{
			if(size < 10)
				SOP("doing...");
			else
				SOP("...");
		}
		public void eat()
*/
public class Hippo
{
	private int size;
	
	public void setSize(int val)
	{
		if(val > 0 && val <= 200)
			size = val;
		else
			System.out.println("bevakoof, you have assigned wrong value to size, you muttal");
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void dance()
	{
		if(size!=0)
		{
			if(size < 10)
				System.out.println("hippo doing break dance like MJ!");
			else
				System.out.println("hippo doing naagin dance like Naagini!");
		}
		else
			System.out.println("first set maadu and then dance maadsu!");
	}
	
	public void eat(String foodName)
	{
		if(size!=0)
		{
			if(size < 40)
				System.out.println("hippo eating "+foodName+" very quickly");
			else
				System.out.println("hippo eating "+foodName+" very slowly");
		}
		else
			System.out.println("first set maadu and then dance maadsu!");
	}
}

class TestHippo
{
	public static void main(String[] args)
	{
		Hippo h1 = new Hippo();
		//h1.size = 5;
		h1.setSize(-5);
		h1.dance();
		h1.eat("curd rice");
		h1.eat("rasam rice");
		Hippo h2 = new Hippo();
		//h2.size = -55;
		//h2.setSize(55);
		h2.dance();
		h2.eat("dosa");
		h2.eat("pizza");
		
		System.out.println("h2.size = "+h2.getSize());
	}
}


