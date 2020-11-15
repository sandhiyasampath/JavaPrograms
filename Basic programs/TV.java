/* 8) There are TVs. A TV has a name and channel that is being displayed.
You can increment/decrement channel. You can change the channel to a
given number as well. You can ask the TV to display. When a TV is
asked to display, it will print the channel num, the volume.TV has volume
(int). You have to switch on the TV first before you can operate the
channels or increase or decrease the volume. Design and test TV
working. */

public class TV
{
	private String name;
	private int channel;
	private int volume;
	public final int MAX_VOLUME = 100;
	public final int MIN_VOLUME = 0;
	public final int MAX_CHANNEL = 500;
	public final int MIN_CHANNEL = 1;
	private boolean isTvSwitchedOn;
	public void setName(String s)
	{
		if(s=="null" || s==null || s.length()==0)
		{
			System.out.println("Please give a valid TV name");
		}
		else
		{
			name = s;
			System.out.println("your Tv name = "+name);
		}
	}
	public String getName()
	{
		return name;
	}
	public void setChannel(int n1)
	{
		if(n1<=MAX_CHANNEL && n1>=MIN_CHANNEL)
		{
			channel = n1;
		}
		else
		{
			System.out.println("your trying to change the channel which does not exist");
		}
	}
	public int getChannel()
	{
		return channel;
	}
	public void setVolume(int n2)
	{
		if(n2<=MAX_VOLUME && n2>=MIN_VOLUME)
		{
			volume = n2;
		}
		else
		{
			System.out.println("your trying to change the volume which is out of boundry");
		}
	}
	public int getVolume()
	{
		return volume;
	}
	public void setIsTvSwitchedOn(boolean b)
	{
		isTvSwitchedOn = b;
	}
	public boolean isTvSwitchedOn()
	{
		return isTvSwitchedOn;
	}
	public void switchOn()
	{
		if(isTvSwitchedOn==false)
		{
			setIsTvSwitchedOn(true);
			System.out.println("TV switched on now");
		}
		else
		{
			System.out.println("Tv is already switched on");
		}
	}
	public void incrementChannel()
	{
		if(isTvSwitchedOn==true && channel<=MAX_CHANNEL && channel>=MIN_CHANNEL)
		{
			channel++;
			System.out.println("You changed the channel to "+channel);	
		}
		else
		{
			System.out.println("First switch on the TV or Use channel and volume in propoer range");
		}
	}
	public void decrementChannel()
	{
		if(isTvSwitchedOn==true && channel<=MAX_CHANNEL && channel>=MIN_CHANNEL)
		{
			channel--;
			System.out.println("You changed the channel to "+channel);	
		}
		else
		{
			System.out.println("First switch on the TV or Use channel and volume in propoer range");
		}
	}
	public void incrementVolume()
	{
		if(isTvSwitchedOn==true && volume<=MAX_VOLUME && volume>=MIN_VOLUME)
		{
			volume ++;
			System.out.println("You changed the volume to "+volume);	
		}
		else
		{
			System.out.println("your trying to change the volume which is out of boundry or first  switch on the TV");
		}
	}
	public void decrementVolume()
	{
		if(isTvSwitchedOn==true && volume<=MAX_VOLUME && volume>=MIN_VOLUME)
		{
			volume --;
			System.out.println("You changed the volume to "+volume);	
		}
		else
		{
			System.out.println("your trying to change the volume which is out of boundry or first  switch on the TV");
		}
	}
	public void changeChannel(int num)
	{
		if(isTvSwitchedOn==true && channel<=MAX_CHANNEL && channel>=MIN_CHANNEL)
		{
			setChannel(num);
		}
		else
		{
			System.out.println("First switch on the TV or Use channel and volume in propoer range");
		}
	}
	public void display()
	{
		if(isTvSwitchedOn==true)
		{
			System.out.println("Watching TV "+ name+" channel number "+channel+" with volume = "+volume);	
		}
		else
		{
			System.out.println("TV in Off condition");
		}
	}
	public void switchOff()
	{
		if(isTvSwitchedOn==true)
		{
			setIsTvSwitchedOn(false);
			System.out.println("Tv Switched Off");
		}
		else
		{
			System.out.println("Tv is already Switched OFF");
		}

	}
}
