public class Item
{
	private String name;
	private double price;
	public Item()
	{
	}
	public Item(String itemName,double itemPrice)
	{
		if(itemName.length()==0 || itemName=="null" || itemName==null)
		{
			System.out.println("give a valid name");
		}
		else
		{
			name = itemName;
			price = itemPrice;
		}
	}
	public void setName(String itemName)
	{
		if(itemName.length()==0 || itemName=="null" || itemName==null)
		{
			System.out.println("give a valid name");
		}
		else
		{
			name = itemName;
		}
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(double itemPrice)
	{
		if(itemPrice<=0)
		{
			System.out.println("give a valid price");
		}
		else
		{
			price = itemPrice;
		}
	}
	public double getPrice()
	{
		return price;
	}
}
class Cap extends Item
{
	public Cap(String itemName,double itemPrice)
	{
		if(itemName.length()==0 || itemName=="null" || itemName==null)
		{
			System.out.println("give a valid name");
		}
		else
		{
			setName(itemName);
			setPrice(itemPrice);
		}
	}
}
class Pen extends Item
{
	public Pen(String itemName,double itemPrice)
	{
		if(itemName.length()==0 || itemName=="null" || itemName==null)
		{
			System.out.println("give a valid name");
		}
		else
		{
			setName(itemName);
			setPrice(itemPrice);
		}
	}
}
class Lipstic extends Item
{
	public Lipstic(String itemName,double itemPrice)
	{
		if(itemName.length()==0 || itemName=="null" || itemName==null)
		{
			System.out.println("give a valid name");
		}
		else
		{
			setName(itemName);
			setPrice(itemPrice);
		}
	}
}
class NoteBook extends Item
{
	public NoteBook(String itemName,double itemPrice)
	{
		if(itemName.length()==0 || itemName=="null" || itemName==null)
		{
			System.out.println("give a valid name");
		}
		else
		{
			setName(itemName);
			setPrice(itemPrice);
		}
	}
}
	
