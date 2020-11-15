public class Person
{
	private String name;
	private int age;
	static int count=0;
	public Person()
	{
		count++;
		System.out.println("in Person no-arg constr");
	}
	public Person(String n)
	{
		count++;
		System.out.println("in person string param constr");
		setName(n);
		
		
	}
	public Person(String name,int age)
	{
		count++;
		System.out.println("in person string,int param constr");
		setName(name);
		setAge(age);
		
	}
	public void setName(String s)
	{
		
		if(s=="null" ||  s.isEmpty()  || s.length()>30)
		{
			System.out.println("Please Give Valid name "+s);
		}
		else
		{
			name=s;
		}
	}
	public String getName()
	{
		return name;
	}
		
	public void setAge(int a)
	{
		if((a<0) && (a>100))
		{
			System.out.println("Please Give valid age");
		}
		else
		 {
  			age=a;
		 }
	}
	public int getAge()
	{
		return age;
	}

}
