public class TestPet
{

	public static void main(String[] args)
	{
		//Pet p = new Pet();
		System.out.println(Pet.X);
		Pet p = new Snake();
		p.play();
		//p.hiss();
		
		Hissable h = new Snake();
		h.hiss();
	}
}





