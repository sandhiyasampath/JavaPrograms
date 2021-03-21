
public class Doggy {
	String name;
	private int size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void bark()
	{
		if(size>10)
		{
			System.out.println("meows");
		}
		else if(size<=10)
		{
			for(int i=0;i<=size;i++)
			{
			System.out.println("bow wow"+"    "+"name is"+"  "+name);//prints bow wow as many times of size
			}
		}
	}

}
