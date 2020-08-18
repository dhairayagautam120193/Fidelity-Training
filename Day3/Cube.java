package Day3;

import java.util.Scanner;

public class Cube {
	
	//WAP TO PRINT CUBE OF A NUMBER
	public static void main(String[] args) {
		
		System.out.println("Enter the number ");
		
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		
		int cube=a*a*a;
		
		System.out.println("Cube of a number is: "+cube);
		
	}

}
