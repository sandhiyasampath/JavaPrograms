/*Build an interface Pet
public interface Pet
{
public void play();
}
and save it in Pet.java.
Compile it. Now try to add a constructor and see if compilation succeeds. Try to add
a method with body and see if it compiles. Try to add a final method and see if it
compiles. Add a variable without a value and see if compiles.
package uttara.solutions.Interface;*/


//remove the comments and try compiling it
public interface Pet
{


	//trying to add a constructor  which is not possible compilation fails

	/*Pet()//Interfaces cannot have constructors
	{

	}*/

	//trying to add a constructor  which is not possible compilation fails
	/*public void showAffection()//Abstract methods do not specify a body
	{

	}*/

	//Try to add a final method and see if it compiles. Add a variable without a value and see if compiles.
	/*public final void testMethod();*/
	//Illegal modifier for the interface method testMethod; only public, abstract, default, static and strictfp are permitted

	//int i; //if u declare variable in interface it will be final field which sould be initialized

	int X = 10;
	String NAME ="Pingu";
	public void play();

}

