/*d) There are Bags. You can use the bag to store items (for which the user of the bag will give
max number of items at construction time). You can then retrieve items from the bag. An item
has a name and a price. Caps, notebooks, pens, lipstick are all items. A bag can be used to
search for a given item. You can request the bag to give you the total of prices of all the items in
the bag. Write a tester class to test creation of bags, items, then add items into the bags and
invoke the various methods of bag to test how to search, retrieve, get total, get individual price
of items.*/
package Inheritance;

public class TestBag {

	public static void main(String[] args) {
		Bag b=new Bag("WildCraft",4);

		Item item1=new Pen("cello",10.5);
	    Item item2=new Pen("WritoMeter",20.5);
	    Item item3=new NoteBook("classic",30);
	    Item item4=new NoteBook("classmate",96.8);

	    b.addItem(item1);
	    b.addItem(item2);
	    b.addItem(item3);
	    b.addItem(item4);
	    	   boolean v=b.searchItem("cello");

	   System.out.println("----> "+v);

	  double itemprice=b.getItemPrice("classmate");
	  System.out.println("item price is "+itemprice);

	  double tot=b.getTotal();
	  System.out.println("Total price is "+tot);

	  Item i=b.getItem(2);
	  System.out.println("your Item is "+i.toString());


	}

}
