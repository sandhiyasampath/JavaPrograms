/*10) Consider an int input (for ex 100). Using << and >>, multiply/divide the number by 2, 4,
8. Verify the results on paper.!*/

package uttara.solutions.prac1;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		System.out.println(100>>2);    //>> divide ----> 100/2^2
		System.out.println(100>>4);
		System.out.println(100>>8);
		System.out.println(100<<2);
		System.out.println(100<<4);     // << multiply ----> 100*2^4
		System.out.println(100<<8);

	}

}
