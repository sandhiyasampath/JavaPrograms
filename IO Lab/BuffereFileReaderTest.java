import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffereFileReaderTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("/home/abhi/Downloads/in.txt"));
			bw = new BufferedWriter(new FileWriter("/home/abhi/Downloads/out.txt",true));
			
			int c;String line;
			/*to read one one line at a time
			while((line=br.readLine())!=null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}*/
			
			 //read one one char at a time
			 while((c=br.read())!=-1){
			  		bw.write(c);
			 }
			
		}
		catch(IOException i) {
			System.out.println("catch excecuteed");
			i.printStackTrace();
		}
		finally {
			try {
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
