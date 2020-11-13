/* e) There are Bags. You can use the bag to store items (for which the
user of the bag will give max number of items at construction time).
You can then retrieve items from the bag. An item has a name and a
price. Caps, notebooks, pens, lipstick are all items. A bag can be used
to search for a given item. You can request the bag to give you the to-
tal of prices of all the items in the bag. Write a tester class to test cre-
ation of bags, items, then add items into the bags and invoke the vari-
ous methods of bag to test how to search, retrieve, get total, get indi-
vidual price of items. */

public class Bag
{
	public String name;
	Item[] item;
	static int count = 0;
	public static final int MAX_NUMBER = 10;
	public Bag(String itemName,int size)
	{
		if((itemName.length()==0 || itemName=="null" || itemName==null) && size<=MAX_NUMBER)
		{
			System.out.println("give a valid name");
		}
		else
		{
			name = itemName;
			item = new Item[size];
		}
	}	
	public void storeItem(Item i)
	{
		item[count] = i;
		if(count<=MAX_NUMBER)
		{
			count++;
		}
	}
	public Item retrieve(int position)
	{
		return item[position];
	}
	public boolean search(String itemName)
	{
		boolean b=false;
		for(Item i : item)
		{
			if(i.getName().equals(itemName))
			{
				b = true;
				return true;
			}
		}
		if(b!=true)
		{
			return false;
		}
		return true;
			
	}
	public double getItemPrice(String itemName)
	{
		double d = 0;
		for(Item i : item)
		{
			if(i.getName().equals(itemName))
			{
				d = i.getPrice();
				System.out.println(d);
			}
		}
		return d;
	}
	public double totalPriceOfAllItemsInTheBag()
	{
		double sum=0;
		for(Item it:item)
		{
			sum=sum+it.getPrice();
		}
		return sum;
	}

}

