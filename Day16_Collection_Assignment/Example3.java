package collectionAssignment;

import java.util.ArrayList;

public class Example3 {

	//Write a Java program to retrieve an element (at a specified index) from a given array list
	
	public static void main(String[] args) {
		
		ArrayList<Integer>employeeId = new ArrayList<>();	
		
		employeeId.add(55815);
		employeeId.add(46815);
		employeeId.add(99815);
		employeeId.add(24815);
		
		//Traversing the list
		
		for(int empid:employeeId){
			System.out.println(empid);
		}
		
		System.out.println("Retrieve an element from first index/2nd position in array list: "+employeeId.get(1));
		
		
	}
}
