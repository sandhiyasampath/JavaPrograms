
package uttara.solutions.strings;
/*
 * WAP (directly in main()) to create an array of strings with 5 colors as values. Use Math.random() to randomly print out 5 values from the array.
 */
public class TestMath {

	public static void main(String[] args)
	{
		String[] color={"red","blue","black","pink","green"};
		int len=color.length;
		double value=Math.random();
		int pos=(int)(value*len);
		System.out.println("color at position "+pos+" is "+color[pos]);

	}

}
