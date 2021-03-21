
//4) Print 1 to 10 to the monitor using for, while, do..while!

package uttara.solutions.prac1;

public class Ques4 {

	public static void main(String[] args) {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println("using for "+i);
		 }

		 System.out.println(" ");
		 // using while

		 int k=1;

		 while(k<=10)
		 {
			 System.out.println("using while "+k);
			 k++;
		 }

		 System.out.println(" ");

		 int y=1;

		 // using do...
		 do
		 {
			 System.out.println("using do "+y);
			 y++;
		 }
         while(y<=10);
	}

}
