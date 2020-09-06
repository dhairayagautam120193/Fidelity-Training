package fileHandling;

import java.io.File;

public class Question1 {

	
	public static void main(String[] args) throws Exception{
		
		File dir = new File("db");
		
		dir.mkdir();
		
		File file1 = new File("db","Demo.txt");
		File file2 = new File("db","Demo1.txt");
		File file3 = new File("db","Demo2.txt");
		
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
		String s[]=dir.list();
		int count=0;
		
		for(String filename:s){
			
			System.out.println(filename);
			
			count++;		
				
			
		}
		System.out.println("Total no.of files in directory "+dir+" are: "+count);
		
	}
}
