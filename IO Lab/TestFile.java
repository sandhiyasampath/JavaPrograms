import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");///home/abhi/Downloads/IOLab/IOLab/
		String s = sc.nextLine();
		File f = new File(s);
		System.out.println("is it file exists = "+f.exists());
		System.out.println("is a directory = "+f.isDirectory());
		System.out.println("is a file = "+f.isFile());
		System.out.println("AbsolutePath = "+f.getAbsolutePath());
		System.out.println("size = "+f.length());
		System.out.println("is hidden = "+f.isHidden());
		if(f.exists() && f.isDirectory() ) {
			File[] fr = f.listFiles();
			for(File f1:fr) {
				if(f1.isFile() && f1.exists() && f1.getName().endsWith(".txt")) {
					BufferedReader bf = null;
					try {
						bf = new BufferedReader(new FileReader(f1));
						String line;
						while((line=bf.readLine())!=null) {
							System.out.println(line);
						}
					}
					catch(IOException i) {
						i.printStackTrace();
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
	}
}
