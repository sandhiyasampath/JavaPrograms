public class TestQuestionFivePerson
{
	public static void main(String[] args)
	{
		QuestionFivePerson p = new QuestionFivePerson();
		p.commute("150 kelometter");
		p.sing();
		p.walk();
		Food f = new Food();
		p.eat(f);
		p.generatePrime(47);
		p.generatePrime(3);
		p.generatePrime(11);
	}
}
