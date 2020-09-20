package collectionAssignment;

import java.util.ArrayList;

public class Example2 {


	public static void main(String[] args) {


		ArrayList<Integer> numbers= new ArrayList<Integer>();

		numbers.add(45);
		numbers.add(78);
		numbers.add(22);

		for(int num:numbers){

			System.out.println(num);
		}
		
		//Adding the element at the first position
		
		System.out.println("Adding the element at the first position");
		
		numbers.add(0, 117);

		for(int num:numbers){

			System.out.println(num);
		}



	}
}
