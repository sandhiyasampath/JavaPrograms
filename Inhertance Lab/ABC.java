/* 5) Create a class A with inst variable String name = "A" and an SOP in paramconstructor.Create a class B which extends A and also has String name = "B" and an SOP in its constr. In tester class, create object of B and verify what constructors are getting fired. Using ref of B, point to the object and print the name value.Also using a ref of A, point to the same object and print name value.Add a method in A named print(){ SOP("in A "+name)}; Invoke print() using both the ref in tester class and verify what happens.Now override the print() method in B with print(){SOP("in B "+name)};Recompile and run the tester class. Are you understanding what is happening? Type of ref dictates which redeclared/hidden variable is picked. Type of object dictates which inst method body is picked.Now make both the method and variable as static in both the classe.Recompile and run and verify how statics work when redeclared.Ask queries if you have any doubts. */
package InterfaceLab;
public class ABC
{
	String name = "A";
	public ABC(String s)
	{
		name = s;
		System.out.println("in ABC class parameterized constructor name = "+name);
	}
	public void print()
	{
		System.out.println("in ABC class name ="+name);
	}
}
class DEF extends ABC
{
	String name = "B";
	public DEF(String s)
	{
		super(s);
		System.out.println("in DEF class parameterized constructor name  = "+name);
	}
}
class TestABC
{
	public static void main(String[] args)
	{
		DEF obj1 = new DEF("Sandhiya");
		System.out.println(obj1.name);
		ABC obj2 = obj1;
		System.out.println(obj2.name);
		obj1.print();
		obj2.print();
	}
}
