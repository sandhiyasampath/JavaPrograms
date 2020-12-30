import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path to read which should exists");
		String s1 = sc.nextLine();
		System.out.println("Enter a path to write which should not exists");
		String s2 = sc.nextLine();
		File f1 = new File(s1);
		File f2 = new File(s2);
		if(f1.exists() && f1.isDirectory()) {
			File[] f = f1.listFiles();
			for(File fl : f) {
				if(fl.exists() && fl.isFile() && fl.getName().endsWith(".txt")) {
					BufferedReader bf = null;
					BufferedWriter bw = null;
					try {
						bf = new BufferedReader(new FileReader(fl));
						bw = new BufferedWriter(new FileWriter(f2,true));
						String line;
						while((line=bf.readLine())!=null) {
							bw.write(line);
							bw.newLine();
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
							if(bw!=null)
								bw.close();
						}
						catch(IOException i) {
							i.printStackTrace();
						}
					}
				}
			}
		}
	}
}