package fileHandling;

import java.io.File;
import java.io.FileInputStream;

public class Question4 {

	
	public static void main(String[] args) throws Exception {
		
		File file = new File("Records.txt");
		
		file.createNewFile();
		
		FileInputStream fis = new FileInputStream(file);
		
		int i=0;
		
		while((i=fis.read())!=-1){
			
			System.out.print((char)i);
			
		}
		
	}
}
