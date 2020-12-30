import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxNoOfOccurenceOfAWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		maxOccurence(path);
	}
	public static void maxOccurence(String path) {
		File f = new File(path);
		if(f.exists()  && f.isFile()) {
			BufferedReader bf = null;
			int count = 0;
			int maxCount = 0;
			String[] words = null;
			String line;
			String maxOccurrence = null ;
			List<String> l = new ArrayList<String>();
			try {
				bf = new BufferedReader(new FileReader(f));
				while((line=bf.readLine())!=null) {
					words = line.split(" ");
					if(words!=null) {
						for(String s: words) {
							l.add(s);				
						}
					}
				}
				for(String lt:l) {
					count = Collections.frequency(l, lt);
					if(count>maxCount) {
						maxCount = count;
						maxOccurrence = lt;
						System.out.println(lt);
					}
				}
				System.out.println("The word "+maxOccurrence +" is occurring the max number of times in a file! no of times = "+maxCount);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(bf!=null)
						bf.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
