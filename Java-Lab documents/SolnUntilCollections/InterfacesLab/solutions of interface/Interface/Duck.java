package uttara.solutions.Interface;

public class Duck {
	int size;
	static int count;            // here we have to make variable as static ..(single copy variable)
	public Duck(int size) {
		super();
		this.size = size;
		count++;
	}
	
	public void swim()
	{
		if(size==5)
			System.out.println("Duck is swiming fastly");
		else if(size==10)
			System.out.println("Duck is swiming slowly");
		else if(size==15)
			System.out.println("Duck is swiming very slowly");
		else
			System.out.println("Duck size should be correct..");    // error case..
		
	}

}
