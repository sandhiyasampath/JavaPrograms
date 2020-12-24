import java.util.LinkedHashSet;
import java.util.Set;

/*9) Take a sentence input (hardcode in main()) and display all the unique words in the
sentence without duplicates in the same order.*/
public class UniqueWordsInSentence {
	public static void main(String[] args) {
		String str = "jonny jonny yes pappa eating sugar no pappa telling lies no pappa open your mouth hahaha";
		uniqueWords(str);
	}
	public static void uniqueWords(String str) {
		String[] words = str.split(" ");
		Set<String> s = new LinkedHashSet<String>();
		for(String setWords: words) {
			s.add(setWords);
		}
		System.out.println(s);

	}
	
}
