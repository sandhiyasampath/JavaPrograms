package uttara.solutions.Interface;

public class B1 extends A1 {

	static String name="B";
	public  B1(String name) {
		super(name);
		
		System.out.println("inside const B1 "+name);
	}
	public static void print(){
		System.out.println("in B "+name);
	}
}
