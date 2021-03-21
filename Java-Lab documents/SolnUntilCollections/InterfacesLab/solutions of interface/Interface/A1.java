package uttara.solutions.Interface;

public class A1 {// remove satatic and verify for variable and methods first in both A1 and B1

	static String name="A";
public A1(String name) {
	this.name= name;
	System.out.println("inside the const A1"+name);
}

public static void print(){ 
	System.out.println("in A "+name);
}

}
