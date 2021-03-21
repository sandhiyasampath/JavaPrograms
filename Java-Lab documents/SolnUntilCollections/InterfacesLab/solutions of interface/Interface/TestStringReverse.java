/*Build a StringReverser interface. A StringReverser is one which can reverse a
string. Create two different imply of reversing a string. Test out both the
implementations.*/
package uttara.solutions.Interface;

public class TestStringReverse {

	public static void main(String[] args) {

		StringReverser sr=new StrImpl1();
		System.out.println(sr.revereString("bangalore"));  // implementation --->1


		StringReverser st=new StrImpl2();
		System.out.println(st.revereString("bangalore"));   // implementation --->2

		StringReverser sm=new StrImpl2();
		System.out.println(sm.revereString("bangalore"));     // implementation --->3




	}

}
