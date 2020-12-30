import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void fileCopy(String from,String to) throws IOException{
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(from));
			bos = new BufferedOutputStream(new FileOutputStream(to,true));
			
			int c;
			while((c=bis.read())!=-1) {
				bos.write(c);
			}
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		finally {
			try {
				if(bis!=null)
					bis.close();
				if(bos!=null)
					bos.close();
			}
			catch (IOException e) {
				throw e;
			}
		}
	}


	public static void main(String[] args) {
		try {
			String from = "/home/abhi/Downloads/in.txt";
			String to = "/home/abhi/Downloads/out.txt";
			
			fileCopy(from, to);
		}
		catch(IOException i) {
			i.printStackTrace();
		}


	}

}
