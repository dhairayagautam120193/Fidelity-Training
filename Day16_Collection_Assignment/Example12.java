package collectionAssignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class Example12 {

	//Write a Java program to iterate a linked list in reverse order
	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(88);
		numbers.add(49);
		numbers.add(77);
		numbers.add(53);
		numbers.add(91);
		

		ListIterator list_itr = numbers.listIterator();
		
		System.out.println("Iterating list in sequential order");
		
		while(list_itr.hasNext()){
			
			System.out.println(list_itr.next());
		}
		
		System.out.println("Iterating list in reversal order");
		
		while(list_itr.hasPrevious()){
			
			System.out.println(list_itr.previous());
		}
		
		
	}
}
