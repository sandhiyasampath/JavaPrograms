/* There are ducks in a pond. Ducks swim. They swim according to their sizes.Ducks come in sizes chota, bada and biggest which are int values (5, 10, 15) and are constants (where can you hold constants?).Provide a constructor in Duck which takes in the int size to store the state of the duck. When swim is invoked, they swim fastest, slow, slowest correspondingly.Keep a count to keep track of the number of duck objects created as well (single copy variable incremented each time object is created?).Write a tester class. Create 3 Duck objects with each of the mentioned sizes. Ask them to swim. Verify if they are swimming as per the sizes. Also try to create a Duck object by passing in a different int value, there should be an error displayed. Use the constant name to pass the value into the constructor and not a int value
directly. Print the number of duck objects created as well.*/
package InterfaceLab;
public class Duck
{
	public static final int CHOTA_SIZE = 5;
	public static final int BADA_SIZE = 10;
	public static final int BIGGEST_SIZE = 15;
	public int count;
	public Duck(int size)
	{
		count++;
		if(size!=5 && size != 10 && size != 15)
		{
			System.out.println("please give valid size");
		}
	}
	public void swim(int size)
	{
		if(CHOTA_SIZE == size)
		{
			System.out.println("i am a duck swiming faster");
		}
		if(BADA_SIZE == size)
		{
			System.out.println("i am a duck swiming slow");
		}
		if(BIGGEST_SIZE == size)
		{
			System.out.println("i am a duck swiming slowest");
		}
	}
}
class TestDuck
{
	public static void main(String[] args)
	{
		Duck d1 = new Duck(5);
		d1.swim(5);
		Duck d2 = new Duck(10);
		d2.swim(10);
		Duck d3 = new Duck(15);
		d3.swim(15);
		Duck d4 = new Duck(151);
	}
}
