package collectionAssignment;

import java.util.ArrayList;

public class Example8 {
	
	//Write a Java program to compare two array lists
	
	public static void main(String[] args) {
		
		ArrayList<String> firstList=new ArrayList<String>();  
		//adds elements to the arraylist  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Guava");  
		firstList.add("Mango");  
		System.out.println(firstList);  
		
		//second array list      
		
		ArrayList<String> secondList=new ArrayList<String>();  
		//adds elements to the arraylist  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Guava");  
		secondList.add("Mango");  
		System.out.println(secondList);  
		//comparing both lists  
		
		boolean boolval = firstList.equals(secondList); //returns true because lists are equal  
		System.out.println("Comparing list: "+boolval);  
		//adding another element in the second list  
		secondList.add("Papaya");  
		
		System.out.println("Modified List");
		System.out.println(secondList);
		//again comparing both lists  
		boolean bool = firstList.equals(secondList); //returns false because lists are not equal   
		System.out.println("Comparing list after adding one more element: "+bool);  
		
	}
	
	
}
