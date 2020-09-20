package collectionAssignment;

import java.util.LinkedList;

public class Example11 {

	//Write a Java program to append the specified element to the end of a linked list
	
	public static void main(String[] args) {
		
		LinkedList<String> mobilePhones = new LinkedList<>();
		
		mobilePhones.add("Samsung");
		mobilePhones.add("Apple");
		mobilePhones.add("Redmi");
		mobilePhones.add("One plus");
		
		for(String str:mobilePhones)
		{
			
			System.out.println(str);
		}
		
		System.out.println();
		
		System.out.println("Adding element in the end of the list");
		
		mobilePhones.addLast("Vivo");
		
		for(String str:mobilePhones)
		{
			
			System.out.println(str);
		}
		
	}
}
