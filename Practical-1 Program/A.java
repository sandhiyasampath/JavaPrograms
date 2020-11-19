/*Create a A.java. Create 3 class definitions named A, B, C. Try to make all of them be
marked public. Have empty body. Compile A.java. Are you able to compile? If not why not?
Mark B, C with package access (remove access specifier) and then compile. Now is it
compiling? Why so?
Insert main() in all 3 call definitions with different SOPs. Which main() will gets executed?
Execute all the 3 class`s main().*/
public class A
{
	public static void main(String[] args)
	{
		System.out.println("class A is main is excecuting");
		String[] s = new String[5];
		String[] s1 = new String[5];
		B.main(s);
		C.main(s1);
	}
}

class B
{
	public static void main(String[] args)
	{
		System.out.println("class B is main is excecuting");
	}
}
class C
{
	public static void main(String[] args)
	{
		System.out.println("class C is main is excecuting");
	}

}
