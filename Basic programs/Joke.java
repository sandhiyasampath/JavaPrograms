/*4) Create a Joke class. A Joke has a text and has print functionality (text instance variable
and print()). When you invoke print() on a Joke object, the text will be printed to the
monitor. Mark the text variable private, expose setter/getter and have a parameterised
constructor to pass in the text during Joke object creation time. Keep a track of Joke
objects that are created. How will you create a single copy count variable? Where will you
increment it? Test in a tester class by creating a few Joke objects and printing Joke.count
to monitor.*/

public class Joke
{
	private String text;
	private static int count = 0;
	public static void main(String[] args)
	{
		Joke j = new Joke("tell me joke");
		System.out.println(j.getText());
		j.SetText ("why fan is running - because it can't be walk");
		j.print();
		System.out.println(Joke.count);
	}
	public Joke(String text)
	{
		SetText(text);
		count++;
	}
	public void SetText(String str)
	{
		if(str=="null" || str==null || str.isEmpty())
		{
			System.out.println("Give a valid text");
		}
		else
		{
			text=str;
		}
	}
	public String getText()
	{
		return text;
	}
	public void print()
	{
		System.out.println("This is the is joke is printing "+text);
		System.out.println(count);
	}
}
