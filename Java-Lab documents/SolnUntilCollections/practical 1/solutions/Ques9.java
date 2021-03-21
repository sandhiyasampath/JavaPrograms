/*9) Print "divisible" and the number if the num is divisible by 3 or 5 and not both between
1-100!*/

package uttara.solutions.prac1;

public class Ques9 {

	public static void main(String[] args) {
    for(int i=1;i<=100;i++)
    {
    	if(i%3==0^i%5==0)
    		System.out.println("divisible "+i);
    }

	}

}
