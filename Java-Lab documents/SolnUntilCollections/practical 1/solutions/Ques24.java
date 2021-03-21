//Execute the code given below and check the o/p ?!
package uttara.solutions.prac1;

public class Ques24 {

	public static void process(int k)
	{
		k=30;                                                // if u change value here... wch doesn't affect in main method...
		System.out.println("in process() value is "+k);
	}

	public static void main(String[] args) {
		int x=10;
		System.out.println("in main() --> before passing "+x);
		process(x);
		System.out.println("in main() --> after passing "+x);

	}

}
