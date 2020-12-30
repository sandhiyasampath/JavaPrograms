import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NoOfOccurenceOfAWord {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc2.nextLine();
		System.out.println("Enter a word to search");
		String searchString = sc2.nextLine();
		File f = new File(path);
		//sub directory or files of a directory
		if(f.exists() && f.isDirectory()) {
			File[] fr = f.listFiles();
			for(File fi:fr) {
				//checking text file is there in a directory
				if(fi.isFile() && fi.getName().endsWith(".txt")) {
					//in text file no.of occurrence of a word
					int count = 0;
					int pos = 0;
					String line;
					BufferedReader br = null;
					try {
						br = new BufferedReader(new FileReader(fi));
						while((line=br.readLine())!=null) {
							while((pos=line.indexOf(searchString,pos))!=-1){
								count++;
								pos++;
							}
						}
						System.out.println("no of time the occurrence in a line is "+count);
					}
					catch(IOException i) {
						i.printStackTrace();
					}
					finally {
						try {
							if(br!=null)
								br.close();
						}
						catch(IOException i) {
							i.printStackTrace();
						}
						
					}
				}
				/*System.out.println("file or directory name "+fi.getName());
				System.out.println("does it exists "+fi.exists());
				System.out.println("is it a file "+fi.isFile());
				System.out.println("is is a folder "+fi.isDirectory());
				System.out.println("abs path "+fi.getAbsolutePath());
				System.out.println("can read "+fi.canRead());
				System.out.println("------------------------------");
				System.out.println();*/
			}
		}
	}
}
