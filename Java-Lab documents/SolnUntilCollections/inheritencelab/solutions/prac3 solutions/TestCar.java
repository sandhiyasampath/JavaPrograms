/*6) Cars can be started, driven, reversed or stopped. You have to start
the car to drive/reverse/stop it. When car is being driven / reversed, the
fuel reduces. Once the car has no fuel, the car stops. Every car has a
name. Write a tester class to test cars.*/
public class TestCar {

	public static void main(String[] args) {
		Car c=new Car();
		c.name="maruthi";
		c.fuelQty=4;
		c.start();
		c.drive();
		

	}

}
