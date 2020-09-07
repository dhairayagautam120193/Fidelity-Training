package fileHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Question3 {

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your full name..");
		
		String fullName= rd.readLine();
		
		System.out.println(fullName);
		
	}
}
