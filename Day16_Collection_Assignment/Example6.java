package collectionAssignment;

import java.util.ArrayList;

public class Example6 {

	
	// Write a Java program to copy one array list into another
	
	public static void main(String[] args) {
		
	ArrayList<String> list1= new ArrayList<String>();
	
	list1.add("Infosys");
	list1.add("TCS");
	list1.add("Wipro");
	list1.add("cognizant");
	
	System.out.println("First list....");
	
	for(String str:list1){
		
		System.out.println(str);
		
	}
	System.out.println();
	ArrayList<String> list2= new ArrayList<String>();
	
	list2.add("Google");
	list2.add("Microsoft");
	list2.add("Twitter");
	list2.add("Facebook");
	
	System.out.println("2nd list.....");
	
	for(String str1:list2){
		
		System.out.println(str1);
		
	}
		
	
	list2.addAll(list1);
	System.out.println();
	System.out.println("After copying first list into another list....");
	
	for(String str2:list2){
		
		System.out.println(str2);
	}
	
	
	}
	
}
