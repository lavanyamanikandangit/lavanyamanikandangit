package Goodies;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("D://goodies.txt");
			fw.write("file writer");
			fw.flush();
			System.out.println("fw is done");
			fw.close();
			int i=0;
			FileReader fr=new FileReader("D://goodies.txt");
			while((i=fr.read())!=-1);
				System.out.println((char)i);
				
//			fw.close();
}
}
