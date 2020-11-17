/* Problem 4:
Build a StringReverser interface. A StringReverser is one which can reverse a
string. Create two different imply of reversing a string. Test out both the
implementations. */
package InterfaceLab;
public interface StringReverser
{
	void UsingTempVar(String s);
	void UsingLibClass(String s);
}
class StringReverserTwoType implements StringReverser
{
	public static void main(String[] args)
	{
		StringReverserTwoType s = new StringReverserTwoType();
		s.UsingTempVar("Sandhiya");
		s.UsingLibClass("India");
	}
	public void UsingTempVar(String s)
	{
		char[] cr = s.toCharArray();
		for(int i =0; i<=cr.length/2; i++)
		{
			char c = cr[i];
			cr[i] = cr[cr.length-i-1];
			cr[cr.length-1-i] = c;
		}
		s = new String(cr);
		System.out.println(s);
	}
	public void UsingLibClass(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		s = sb.toString();
		System.out.println(s);
	}
}
