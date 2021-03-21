/*5) There are Dogs. Every Dog has a name and a size. Dogs can bark. If
the size of the dog is > 10, it "meows". If the size <=10, then as many
times, it "bow wow" its
name to the monitor. Test Dog design. After testing the same, make the
size variable private and then add setSize()/getSize() method. See how
this impacts your tester class.*/
public class TestDoggy {

	public static void main(String[] args) {
		Doggy d=new Doggy();
		d.name="xyz";
		d.setSize(20);//when we make instance variable as private,
		              //then we cant access that variable directly,we need to use setters and getters to access and its best practise
		d.bark();
		//d.setSize(10);
		//d.bark();

	}

}
