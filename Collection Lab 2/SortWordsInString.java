import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 8) Take a sentence input (hardcode in main()) and sort the words in the sentence and
display the output*/
public class SortWordsInString {
	public static void main(String[] args) {
		String str = "jonny jonny yes pappa eating sugar no pappa telling lies no pappa open your mouth hahaha";
		String[] words = str.split(" ");
		List sortWords = Arrays.asList(words);
		Collections.sort(sortWords);
		System.out.println(sortWords);
		
	}

}
