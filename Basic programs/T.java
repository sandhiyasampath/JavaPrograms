/* 3)Create a static int variable val in a class named T and initialise it to 10. Code a main()
and then print the value of val. Create a reference of T and point it to an object and then
print T.val. Set the reference of T and point it to null and then print T.val. Do you see the
output? Can you explain why? Create a method named test() as an instance method.
Access val and print it there. Invoke test() from main(). Do you see val getting printed?
Now create an instance int variable named p and initialise it to 40. Now in a static method,
access p directly. Try to compile. Does it? Why not? How to access an instance variable in
a static method?? In main(), directly print p. Can you?*/

public class T
{
	static int val = 10;
	int p = 40;
	public static void main(String[] args)
	{
	System.out.println("value of val in before creating object = "+T.val);
	T ref1  = new T();
	System.out.println("value of val after creating object = "+T.val);
	ref1 = null;
	System.out.println("value of val after dereferenced a object = "+T.val);
	T ref2 = new T();
	ref2.test();
	System.out.println(ref2.p);
	}
	public void test()
	{
	
	System.out.println(T.val);

	}
}
