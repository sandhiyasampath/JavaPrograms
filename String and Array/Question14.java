/* 14) Person has a name and age. A person has a number of pet
names(20max) which he obtains over a period of time. He can dance; if
his age is less than 25 he can do chacha. If his age is greater than 25,
he does the waltz. He can sing too and when he is asked to sing, he
uses his petnames to form the song (randomly). Write a tester program
to test persons. */

public class Question14
{
	public static void main(String[] args)
	{
		Question14 p = new Question14();
		p.setName ("sandhiya");
		p.setAge (26);
		String[] sr = {"sandy","nandy","candy","aunty","loody","beauty","party","koondy","pondy","thondy"};
		p.setPetName (sr);
		p.sing();
	}
	private String name;
	private int age;
	private String[] petName = new String[20];
	public void setName(String s)
	{
		if(s.length()==0 || s==null || s=="null")
		{
			System.out.println("Give a valid name ");
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
		if(a==0 || a<0 )
		{
			System.out.println("givev a valid age");
		}
		else
		{
			age=a;
		}
	}
	public void setPetName(String[] sr)
	{
		if(sr.length<=petName.length)
		petName=sr;
	}
	public void dance()
	{
		if(age<25)
		{
			System.out.println("i am "+name+" and my age is "+age+"doing cha cha cha dance");
		}
		if(age>25)
		{
			System.out.println("i am "+name+" and my age is "+age+"doing waltz dance");
		}
			
	}
	public void sing()
	{
		String song = "";
		for(int i=0; i<petName.length; i++)
		{
			int n = (int)(20*Math.random());
			song = song + petName[n];
		}
		System.out.println("i am"+name+" and my age is"+age+" singing "+song);
	}
	int count = 0;
	public void addPetName(String n)
	{
	if(count < petName.length)
	petName[count++] = n;
	else
	System.out.println("you can give only 20 prt name");
	}
}
