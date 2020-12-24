import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class InterviewQuestion{
	public static void main(String[] args) {
		List l = new LinkedList();
		l.add("[");
		l.add("A");
		l.add("]");
		System.out.println(l);
		ListIterator it = l.listIterator();
		while(it.hasNext()) {
			if("[".equals(it.next()) || "]".equals(it.next()))
				it.remove();
			else
				it.add("*");
		}
		System.out.println(l);
	}

	
}
