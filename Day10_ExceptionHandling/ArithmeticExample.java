package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExample {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int a = sc.nextInt();
		
		int b=0;
		
		try{
		
			int result=a/b;
			
			System.out.println("result is "+result);
		}
		
		catch(ArithmeticException e){
		
			System.out.println(e.getMessage());	
			
			e.printStackTrace();
			
		}
		
		finally{
			
			System.out.println("Finally block--Example for Arihmetic Exception");
		}
	}
}
