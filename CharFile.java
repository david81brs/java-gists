import java.io.*;

public class CharFile {
    public static void main(String[] args){
	String str;
	try (BufferedReader br = new BufferedReader(new FileReader("read.txt"))) {
	    while ((str = br.readLine()) != null) {
		    System.out.println(str);
		}
	} catch  (IOException ioe) {
	    System.out.println("I/O error");
	}
    }
}

		
