
public class Question5 {
	String name;
	String email;
	Address homeAddress;
	Address officeAddress;
	
	public Question5(String name, String email, Address homeAddress, Address officeAddress) {
		this.name = name;
		this.email = email;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("question 5 equals method executed");
		if(obj instanceof Question5) {
			Question5 q = (Question5)obj;
			if(this.name.equals(q.name) && this.email.equals(q.email) && this.homeAddress.equals(q.homeAddress) && this.officeAddress.equals(q.officeAddress))
				return true;
			else
				return false;
		}
		return false;
	}
	public static void main(String[] args) {
		Address a1= new Address("chennai","budhar Street", 606807);
		Address a2 = new Address("chennai","budhar Street", 606807);

		Question5 q = new Question5("Sandhiya","anbu171298@gmail.com",a1,a1);
		Question5 q2 = new Question5("Sandhiya","anbu171298@gmail.com",a2,a2);
		Question5 q3 = new Question5("abhinaya","anbu171298@gmail.com",a2,a2);
		System.out.println(q.equals(q2));
		System.out.println("--------------------------------");
		System.out.println(q.equals(q3));

	}
}
