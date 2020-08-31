package Example1;

import java.util.Scanner;
	
class Adder extends Arithmatic {	
	
	public static void main(String[] args) {
		
		Arithmatic a = new Arithmatic();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		
		int num1 =sc.nextInt();
		
		System.out.println("Enter the Second number: ");
		
		int num2 =sc.nextInt();
		
		int result=a.add(num1, num2);
		
		System.out.println("Result is :"+result);
		
		
	}
}
