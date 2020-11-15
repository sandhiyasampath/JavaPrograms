/*3) A Pen has inkQty (int), colour (string) and can be used to write and
refill. A text must be given for it to write. A quantity must be given to refill.
If there is ink then the pen will write the text given to it (SOP). Refill
works by taking in the int qty to add to the existing inkQty. First as a
class designer, on paper apply OOAD and arrive at the class design.
Then create the class implementation and create a tester class to create
2 pen objects, give it inkQty and ask it to write. First code this on your
own. If you cannot get it correctly, then see Pen.java and TestPen.java.
Then fix the code and rerun. Do not see the code first. */

public class Pen
{
	private int inkQty;
	private String color;
	public void setInkQty(int i)
	{
		if(i<=0 || i>25)
		{
			System.out.println("Give a proper ink Quantity"+i);
		}
		else
		{
			inkQty = i;
		}
	}
	public int getInkQty()
	{
		return inkQty;
	}
	public void setColor(String s)
	{
		if(s==null || s=="null" || s.length()==0)
		{
			System.out.println("Please Give a proper  color"+s);
		}
		else
		{
			color = s;
		}
	}
	public String getColor()
	{
		return color;
	}
	public void write(String s)
	{
		if(inkQty>0 && inkQty<=25)
		{
			System.out.println("i am the pen with color "+color+" writing "+s);
			inkQty--;
		}
		else
		{
			System.out.println("First fill ink then use it to write");
		}
		
	}
	public void refill(int i)
	{
		if(inkQty<=0 || inkQty<=25)
		{
			if((inkQty+i)<=25)
			{
				inkQty = inkQty+i;
				System.out.println("inkQty = "+inkQty);
			}
		}
		else
		{
			System.out.println("Please give a vslid ink quantity");
		}				
	}
}




