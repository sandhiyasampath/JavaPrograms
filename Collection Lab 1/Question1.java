
public class Question1 {

	public static void main(String[] args) {
		String s1 = "Sandhiya";
		String s2 = "Sandhiya";
		String s5 = "Abhinaya";
		String s6= new String("Abhinaya");
		
		System.out.println(s1==s2);// String pool not create the object with the same state of existing state
		System.out.println(s1.equals(s6));
		System.out.println(s5.equals(s6));//string class designer overridden equals method


	}

}
