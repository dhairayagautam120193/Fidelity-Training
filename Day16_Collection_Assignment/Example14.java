package collectionAssignment;

import java.util.HashSet;

public class Example14 {

	//Write a Java program to convert a hash set to an array
	public static void main(String[] args) {
	
		// Create a HashSet
	
	     HashSet<String> hashset= new HashSet<>();
			hashset.add("Operating System");
			hashset.add("Data Structures");
			hashset.add("Database Management System");
			hashset.add("Computer Networks");
			hashset.add("Computer Graphics");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hashset);
	 
	     // Creating an Array
	     String[] array = new String[hashset.size()];
	     hashset.toArray(array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	     }
	  
	}
				
		
	}
	
	

