package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Question5 {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("data.txt",true);
		
		fw.write("with different cultures");
		
		char[] companies ={'A','B','C','D'};
		
		fw.write("\n");
		
		fw.write(companies);
		
		fw.flush();
		
		fw.close();
						
	}
}
