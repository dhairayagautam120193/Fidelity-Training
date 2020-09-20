package collectionAssignment;

import java.util.LinkedList;

public class Example13 {

//Write a Java program to insert elements into the linked list at the first and last position
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

		System.out.println("Adding element in the first position of the list.........");

		mobilePhones.addFirst("Vivo");

		for(String str:mobilePhones)
		{

			System.out.println(str);
		}
		
		System.out.println();

		System.out.println("Adding element in the last position of the list...........");
		
		mobilePhones.addLast("Motorola");

		for(String str:mobilePhones)
		{

			System.out.println(str);
		}
		

	}
}
