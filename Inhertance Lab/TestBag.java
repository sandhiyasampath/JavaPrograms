public class TestBag
{
	public static void main(String[] args)
	{
		Bag b =new Bag("SkyBag",3);
		Item it = new Item("NoteBook",25);
		Item it1 = new Item("Pencil",5);
		//Item it2 = new Item("Bat",1000);
		b.storeItem(it);
		b.storeItem(it1);
		b.retrieve(Bag.count);
		b.getItemPrice("NoteBook");
		//b.addItems(it2);
		b.search("NoteBook");
		double total =b.totalPriceOfAllItemsInTheBag();
		System.out.println("The total amount = "+total);
	}
}
