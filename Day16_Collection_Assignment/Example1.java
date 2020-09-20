package collectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	
	public static void main(String[] args) {
		
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("John");
		names.add("Mathew");
		names.add("Grahm");
		names.add("Lizza");
		names.add("Smith");
		
		//Printing the list
		Iterator<String> itr=names.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}
