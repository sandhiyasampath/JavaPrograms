/*6) *Important problem* Cars can be started, driven, reversed or stopped.
You have to start the car to drive/reverse/stop it. When car is being
driven / reversed, the fuel reduces. Once the car has no fuel, the car
stops. Every car has a name. Write a tester class to test cars. How to
know whether the car has started and then only being asked to be
driven? Try to design on paper first and then see the below design.
Understand how state can impact behaviour.
Car
- name
- fuelQty
- isStarted : boolean
- start()
// if fuelQty > 0
//
set isStarted = true;
- drive()
// check if the car has started, only if
yes,
if(isStarted)
// check if fuelQty>0, then only drive// reduce fuelQty by 1 unit
// if fuelQty==0
stop();
- reverse()
- stop()
// isStarted = false!

*/
public class Car
{
	private int fuelQty;
	private String name;
	private boolean isStarted;
	private final int maxFuel = 100;
	public void setFuelQty(int a)
	{
		if(a<0 || a>maxFuel)
		{
			System.out.println("Please give a valid fuelquantity");
		}
		else
		{
			fuelQty = a;
		}
	}
	public int getFuelQty()
	{
		return fuelQty;
	}
	public void setName(String s)
	{
		if(s=="null" || s==null || s.length()==0)
		{
			System.out.println("Please give a valid name");			
		}
		else
		{
			name =  s;
		}
	}
	public String getName()
	{
		return name;
	}
	public void setIsStarted(boolean b)
	{
		isStarted=b;
	}
	public boolean isStarted()
	{
		return isStarted;
	}
	public void start()
	{
		if(fuelQty<=0)
		{
			System.out.println("there is no fuel in car");
		}
		else if(isStarted==true)
		{
			System.out.println("the car "+name+" has been started already");
		}
		else
		{
			setIsStarted(true);
			System.out.println("the car "+name+" has been started now");
		}
	}
	public void drive()
	{
		if(fuelQty>0)
		{
			if(isStarted==true)
			{
				System.out.println("I am driving the car"+name);
				fuelQty--;
			}
			else if(isStarted==false)
			{
				setIsStarted(true);
				fuelQty--;
			}
		}
		else if(fuelQty<=0)
		{
			stop();
		}
	}
	public void reverse()
	{
		if(fuelQty>0)
		{
			if(isStarted==true)
			{
				System.out.println("I am reversing the car"+name);
				fuelQty--;
			}
			else if(isStarted==false)
			{
				setIsStarted(true);
				System.out.println("I am reversing the car"+name);
				fuelQty--;
			}
		}
		else if(fuelQty<=0)
		{
			stop();
		}
	}
	public void stop()
	{
		if(fuelQty<=0)
		{
			System.out.println("first fill the fuel then use it drive or reverse");
		}
		else if(isStarted==true)
		{
			System.out.println("The car has been stoped");
			setIsStarted(false);
		}
		
		else if(isStarted==false)
		{
			System.out.println("first start the car then use it to drive or reverse or stop");
		}
	}
	public void fillFuel(int fuel)
	{
		if(fuel+fuelQty<maxFuel)
		{
			fuelQty = fuel+fuelQty;
		}
		else
		{
			System.out.println("Give valid range of fuel");
		}
	}		
}
