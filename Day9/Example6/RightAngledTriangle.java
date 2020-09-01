package Example6;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Hypotenuse: ");
		int hypotenuse=sc.nextInt();
		
		System.out.println("Enter the Perpendicular: ");
		int perpenicuar=sc.nextInt();
		
		System.out.println("Enter the Base: ");
		int base=sc.nextInt();
		
		if(hypotenuse*hypotenuse==(perpenicuar*perpenicuar)+(base*base)){
			System.out.println("It is right angled triangle");
			
		}
		else{
			
			System.out.println("It is not a right angled Triangle");
		}
	}
}
