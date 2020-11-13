public class TestAnimal
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.setName("monkey");
		Vet v = new Vet();
		v.treat(a);
		Animal b = new Croc();
		b.setName("croc");
		v.treat(b);
	}
}
