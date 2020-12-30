import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NoOfOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		System.out.println("Enter a word to search");
		String word = sc.nextLine();
		noOfOccurence(path,word);

	}
	public static void noOfOccurence(String path,String word) {
		File f = new File(path);
		if(f.exists() && f.isFile()) {
			BufferedReader br = null;
			String line;
			int pos = 0;
			int count = 0;
			try {
				br = new BufferedReader(new FileReader(f));
				while((line=br.readLine())!=null) {
					if((pos=line.indexOf(word))!=-1) {
						pos++;
						count++;
					}
				}
				System.out.println("No of occurence = "+count);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(br!=null)
						br.close();
				}
				catch (IOException e) {
					e.printStackTrace();				}
			}
		}
	}
}
