package collectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example5 {

	//Write a Java program to sort a given array list

	public static void main(String[] args) {

		ArrayList<String> countries= new ArrayList<>();

		countries.add("India");
		countries.add("America");
		countries.add("Russia");
		countries.add("England");
		countries.add("Israel");
		
		System.out.println("Before sorting: ");
		
		Iterator itr = countries.listIterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		Collections.sort(countries);
		
		System.out.println("After sorting: ");
		
		for(String str:countries){
			System.out.println(str);
		}
		
			
	}
}
