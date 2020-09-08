package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Question3 {

	
	public static void main(String[] args) throws Exception {
		
		InputStream in= System.in;
		
		System.out.println("Enter the text");
		
		FileWriter fw = new FileWriter("File.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		int letter;
		
		while((letter=in.read())!=-1){
			
			bw.write((char)letter);
			
			bw.flush();
			
				}
		System.out.println("Data written to file");
	}
}
