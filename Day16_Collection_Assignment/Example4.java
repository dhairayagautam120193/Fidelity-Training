package collectionAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Example4 {
	
	//Write a Java program to search an element in a array list.
	
	public static void main(String[] args) {
		
		ArrayList<String> countries= new ArrayList<>();
		
		countries.add("India");
		countries.add("America");
		countries.add("Russia");
		countries.add("England");
		countries.add("Israel");
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the country name");
		
		String country=sc.next();
		
		
		if(countries.contains(country))
		{
		
		System.out.println("Entered Country is present in the list");
					
		}
		
		else{
			System.out.println("Entered Country is not present in the list");
		}
		
		
				
		
	}
	
	
	

}
