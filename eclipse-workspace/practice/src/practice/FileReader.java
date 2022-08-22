package practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileReader {
	public static void main(String[] args) throws IOException{
	try (FileInputStream input = new FileInputStream("a.txt");FileOutputStream output = new FileOutputStream("b.txt") ){
	int read;
	while((read = input.read())!=-1) {
	output.write(read);
	}
	System.out.println("Readed");
	}
	catch(IOException e) {
	System.out.println(e);
	}
	}
}


