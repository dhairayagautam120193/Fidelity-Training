package fileHandling;

import java.io.File;

public class Question3 {

	
	public static void main(String[] args) throws Exception{
		
		File file = new File("Data1.txt");
		
		if(file.exists()){
			
			System.out.println("File exists");
		}
		else{
			
			System.out.println("File doesnot exists, hence creating a new file");
			
			file.createNewFile();
		}
	}
}
