public class TestCar
{
	public static void main(String [] args)
	{
		Car c = new Car();//Created obj of car
		c.setName("BMW");
		c.setFuelQty(10);
		c.start();
		c.drive();
		c.stop();
		c.fillFuel(150);
		c.start();
		c.reverse();

	}
}
