/* Food has name and price. Food must be given to Person when you invoke eat().
When a person is asked to eat, he will specify that he is eating food with name and say out
his name as well. Person also has a generatePrime() behaviour. When you give him a
number as input, then he will generate all prime numbers until that number and print to
monitor.*/
public class Food
{
	private String name;
	private String price;
	public void setName(String n)
	{
		if(n=="null" || n==null || n.length()==0)
		{
			System.out.println("Give a valid food name");
		}
		else
		{
			name = n;
		}
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(String p)
	{
		price = p;
	}
	public String getPrice()
	{
		return price;
	}
}
