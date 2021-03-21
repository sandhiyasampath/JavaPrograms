package test;

import vahana.Scooter;

public class TestV
{
	public static void main(String[] args)
	{
		vahana.Vehicle v = new Scooter();
		v.start();
		v.drive();
		v.stop();
			
	}
}
