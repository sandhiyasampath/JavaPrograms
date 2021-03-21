/*Create a byte variable in main(),! !
! byte b = 100;! !
Try to assign 128 to a byte. Are you able to compile? what about -128? Try to compile, run.!
package uttara.solutions.prac1;
Create a byte variable, assign it a value and then store in an int variable.! !
! byte b = 50;!
! int x = b; // why does this work?!
! b = x; // why does this not work?! !
g) Replace last statement with b = (byte) x; and see if it works. Now test the same by
assigning a value to a short, a char and try to assign to an int, long, float, double. Also from
the bigger datatyped variables, put the value to smaller data typed variables. Do not create
2 variables with the same identifier.! !
*/

public class ByteCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=100;        // we can assign..
		/*byte c=128; */     // we can't bcz max range of byte is 127
		byte d=127;   // it works...
		byte f=-128;  // cz -128 is in the range of byte

		// another byte ques...

		byte y=10;
		int x=y;   // is possible bcz implicit casting..
	/*	y=x; */   // we have to do explict casting as shown below
		y=(byte) x;

		short c=5;
		/*byte m=c;*/  // we have to do explict casting as shown below
		byte m=(byte) c;

	   int z=c;  //implcit casting short to int..

	    long l=67;
	    float g=l;//implcit casting short to int..

	   float h=9.0f;
	   double v=h;

	  double j=9.00;
	  /*float f=j*/;  //have to do explict casting..
	}

}
