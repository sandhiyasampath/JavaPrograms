import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortAFile{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.nextLine();
		sortFile(path);
	}
	public static void sortFile(String path) {
		BufferedReader bf = null;
		String line ;
		String[] words ;
		Set<String> withoutDupe = new TreeSet<String>();
		List<String> withDupe = new ArrayList<String>();
		try {
			bf = new BufferedReader(new FileReader(path));
			while((line=bf.readLine())!=null) {
				words = line.split(" ");
				if(words!=null) {
					for(String s:words) {
						withoutDupe.add(s);
						withDupe.add(s);
					}
				}
			}
			Collections.sort(withDupe);
			System.out.println(withDupe);
			System.out.println("-------------------------");
			System.out.println();
			System.out.println(withoutDupe);

		}
		catch(IOException i) {
			i.printStackTrace();
		}
		finally {
			try {
				if(bf!=null)
					bf.close();
			}
			catch(IOException i) {
				i.printStackTrace();
			}
		}
	}
	/*public int compareTo(String s) {
		return this.compareTo(s);
	}*/
}
