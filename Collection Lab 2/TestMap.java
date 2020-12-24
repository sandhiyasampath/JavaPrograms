import java.util.ArrayList;
import java.util.List;

public class TestMap {
	public static void main(String[] args) {
		List l = new ArrayList(3);
		l.add(new Integer(1));
		l.add(new Integer(2));
		l.add(new Integer(1));
		Object o = l.get(0);
		Object o1 = l.get(2);

		
		System.out.println(o==o1);
		System.out.println((int)0.7285);
		int a =10;
		String s = null;
			System.out.println(s.toString());
	}
}
