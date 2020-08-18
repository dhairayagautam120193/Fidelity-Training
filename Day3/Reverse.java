package Day3;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {
		
	System.out.println("Enter the number ");

	Scanner sc = new Scanner(System.in);

	int number = sc.nextInt();
	
	int rev=0;
	
	while(number>0){
		
		int a=number%10;
		
		rev=(rev*10)+a;
		number=number/10;
		
		
	}
	System.out.println("Reverse of a number is: "+rev);
	}
}