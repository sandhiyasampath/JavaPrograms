/*c) Person has a name and age. A person has a number of pet names(20max) which he obtains
over a period of time. He can dance; if his age is less than 25 he can do chacha. If his age is
greater than 25, he does the waltz. He can sing too and when he is asked to sing, he uses his
petnames to form the song (randomly). Write a tester program to test persons.!*/
package inheritence;

public class Person1 {
	private String name;
	 private int age;
	 private String[] petNames = new String[20];
	
	
	 public void sing()
	{
	String song = "";
	for(int i = 0; i  <=petNames.length-1; i++)
	{
	 int n = (int)(20 * Math.random()); 
	 song = song + petNames[n];
	
	 }
	 System.out.println("im singing"+".........>"+song);
	}
	public void dance()
	{
		if(age<25)
		{
			System.out.println("dancing like chacha");
		}
		else
			System.out.println("dancing like waltz");
		
	}







	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getPetNames() {
		return petNames;
	}
	public void setPetNames(String[] petNames) {
		this.petNames = petNames;
	}
	public static void main(String[] args) {
		Person1 p=new Person1();
		p.setAge(23);
		String[] pet={"raja","raju","ranna","manna","hunna","junna","raju","ranna","manna","hunna","junna","kanna","lanna","loki","jam","chala","chandu","vikky","aru","chatu"};
		p.setPetNames(pet);
		p.sing();
		p.dance();
}
	}
