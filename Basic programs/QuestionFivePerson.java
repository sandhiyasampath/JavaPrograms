/*5) *Important* A person has a name, Car, Dog and a favourite Song (reuse classes Car,
Dog and Song from earlier problems given in last Lab). When you ask a Person to
commute and give him a destination (String parameter), then he will start the car, drive the
car and stop the car and print that he has reached the destination. When you ask the
person to sing, he will sing (print) his favourite song with lyrics. When you ask a person to
take a walk, he will take his dog for a walk and the dog will bark. Person has the ability to
eat Food. Food has name and price. Food must be given to Person when you invoke eat().
When a person is asked to eat, he will specify that he is eating food with name and say out
his name as well. Person also has a generatePrime() behaviour. When you give him a
number as input, then he will generate all prime numbers until that number and print to
monitor.*/

public class QuestionFivePerson
{
	private String name;
	public void setName(String s)
	{
		if(s==null || s=="null" || s.length()==0)
		{
			System.out.println("Pleae give a valid name");
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
	public void commute(String s1)
	{
		Car c = new Car();
		c.setName("BMW");
		c.setFuelQty(50);
		c.start();
		c.drive();
		c.stop();
		System.out.println("Now i am reached the destination");
		
	}
	public void sing()
	{
		Song s = new Song("namachivaya","Om namo narayana narayana narayana......");
		s.play();
	}
	public void walk()
	{
		System.out.println("I am walking with my dog");
		Dog d = new Dog();
		d.setName("nimmy");
		d.setSize(3);
		d.bark();
	}
	public void eat(Food f)
	{
		f.setName("Shavarma");
		f.setPrice("Rs.80");
		System.out.println("I am eating "+f.getName()+" it's price is "+f.getPrice());
	}
	public void generatePrime(int num)
	{
		if(num==1)
		{
			System.out.println("neither prime nor composite");
		}
		if(num==2)
		{
			System.out.print("2 ");
		}
		if(num>=3)
		{
			System.out.print("2 3 ");
		}
		double b = 0;
		for(int i = 2; i<=num; i++)
		{
			for(double j=2; j<=i/2.0; j++)
			{
				b=i%j;
				if(b==0)
				{
					break;
				}
			}
			if(b==0)
			{
				continue;
			}
			else if(b==1)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
			
	}
}

