package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;



public class FilenotfoundExample {

	
	public static void main(String[] args) {
		
		
		File file = new File("Demo.txt");
		
		try
		{
		FileInputStream fis = new FileInputStream(file);
		}
		
		catch(Exception e)
		{
			System.out.println("File not found exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
