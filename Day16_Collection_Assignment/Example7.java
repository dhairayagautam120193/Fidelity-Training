package collectionAssignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example7 {

	
	//Write a Java program to reverse elements in a array list
	
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(780);
		number.add(567);
		number.add(117);
		number.add(997);
		number.add(353);
		
		System.out.println("Before reverse");
		
		ListIterator itr = number.listIterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
		System.out.println("After reverse");
		
		
		
		while(itr.hasPrevious()){
			
			System.out.println(itr.previous());
		}
		
		
		
			
		}
		
		
	}

