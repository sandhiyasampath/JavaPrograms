
public class Car {
	String name;
	int fuelQty;
	boolean  isStarted ;
	public void start()
	{
		if(fuelQty>0)
		{
			isStarted=true;
			System.out.println("car is started");
		}
	}
		public void drive()
		{
			
			if(isStarted)
			{
				if(fuelQty>0)
				{
					System.out.println("driving");
					fuelQty--;
					
				}
				if(fuelQty==0)
				{
					stop();
				}
			}
		}
		public void reverse()
		{
			System.out.println("car is reversing");
		}
		public void stop()
		{
			isStarted=false;
			System.out.println("car has stopped");
		}
	}
	

