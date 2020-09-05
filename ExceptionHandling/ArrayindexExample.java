package ExceptionHandling;

import java.util.Scanner;

public class ArrayindexExample {

	
	public static void main(String[] args) {
		
		int[] array={10,20,30,40};
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the index");
				
		int index=sc.nextInt();
		
		try{
			System.out.println(array[index]);
		}
		catch(Exception e){
			
			System.out.println("Array index out of bound:User trying to access the element out of bound");
			
			//System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
		
	}
}
