package uttara.solutions.Interface;

public class TestPet {

	public static void main(String[] args) {
		System.out.println(Pet.NAME); // with it print the name or not, check.
		
		
		//Pet p = new Pet(); // will this compile? check. 
		//above line is a compile time error bcoz we cant create interface object

		Pet p = new Doggy();
		p.play();
		((Doggy) p).barky();//without casting to Doggy we cannot use barky() as its implementations is not present in Pet interface
		
		
	}

}
