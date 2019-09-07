import java.io.*;

public class ReadFile {
    public static void main(String[] args){
	int i;
	FileInputStream fis;
	char byes;
	try {
	    fis = new FileInputStream("read.txt");
	    System.out.println("File found!");
	} catch (FileNotFoundException fnfe){
	    System.out.println("File Not Found");
	    return;
	}
	try {
	    do {
		i = fis.read();
		if (i!=-1) {
		    byes = (char) i;
		    System.out.print(byes);
		}
		} while (i!=-1);
	} catch (IOException ioe){
	    System.out.println("EOF");
	}
	try {
	    fis.close();
	} catch (IOException ioe){
	    System.out.println("Error on file close");
	}
    }
}
