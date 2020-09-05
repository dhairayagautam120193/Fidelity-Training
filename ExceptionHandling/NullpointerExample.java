package ExceptionHandling;

import java.util.Scanner;

public class NullpointerExample {

	
	public static void main(String[] args) {
		
		String s=null;
		
		try{
			
		if(s.equals("Tryblock")){
			
			System.out.println("Try block");
		}
		}
		catch(Exception e){
			System.out.println("Encountered Null pointer execption");
			e.printStackTrace();
		}
		
	}
}
