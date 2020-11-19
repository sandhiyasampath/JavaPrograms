public class TestPen
{
	public static void main(String[] args)
	{
		Pen p = new Pen();
		p.setInkQty(1);
		p.setColor("blue");
		p.write("woo wooo");
		p.refill(23);
		p.write("ra ra ra raaa");
		System.out.println(p.getInkQty());
	}
}
		
