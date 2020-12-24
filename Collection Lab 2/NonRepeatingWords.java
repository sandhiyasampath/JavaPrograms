/*10) Take a sentence input (hardcode in main()) and display non-repeating words only. For
ex: this this is is a what how what is => a how should be output only.*/
public class NonRepeatingWords {
	public static void main(String[] args) {
		String str ="this this is is a what how what"; 
	}
	public static void nonRepeatingWords(String str) {
		String[] words = str.split(str);
		for(int i=0; i< words.length; i++) {
			if(str.contains(words[i])) {
				
			}
		}
	}
}
