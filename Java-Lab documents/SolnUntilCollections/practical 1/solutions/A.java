
/*Create a A.java. Create 3 class definitions named A, B, C. Try to make all of them be
marked public. Have empty body. Compile A.java. Are you able to compile? If not why not?
Mark B, C with package access (remove access specifier) and then compile. Now is it
compiling? Why so?!
Insert main() in all 3 call definitions with different SOPs. Which main() will gets executed?
Execute all the 3 class`s main().package uttara.solutions.prac1;*/

 public class A {

	public static void main(String[] args) {
		 System.out.println("A");                   // oly one of them can be marked as public
		                                           // oly one class public access means compilation
		                                            //works
                          }
}
 class B{

		public static void main(String[] args) {

			 System.out.println("B");
		}
	 }
		 class C {

			public static void main(String[] args) {
				 System.out.println("c");
			}
			}


