import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your First name,Last name,age and salary respectively");
		String s = sc.next();// to read a single word input!
		String s1 = sc.next();
		System.out.println("First Name = "+s);
		System.out.println("Last name = "+s1);
		int i = sc.nextInt();
		System.out.println("age = "+i);
		double d = sc.nextDouble();
		System.out.println("salary = "+d);
		System.out.println("Enter a Line");
		String s2 = sc1.nextLine();
		System.out.println("Line = "+s2);// sentence input!
		System.out.println("Enter a married status and float days ");
		boolean b = sc.nextBoolean();
		System.out.println("Married status = "+b);
		float f = sc.nextFloat();
		System.out.println("no.of days = "+f);
	}

}
