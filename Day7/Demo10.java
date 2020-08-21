package Day7;

import java.util.Scanner;

import methodsPackage.Methods;

public class Demo10 {

	public static void main(String[] args) {

		Methods method = new Methods();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the operation you want to perform:");
		System.out.println("1.Subtraction");
		System.out.println("2.Mutiplication");
		System.out.println("3.Division");
		System.out.println("4.Reversenumber");
		System.out.println("5.Factorial");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:

			System.out.println("Enter the first number:");
			int sub1=sc.nextInt();
			
			System.out.println("Enter the Second number:");
			int sub2=sc.nextInt();
			
			method.subtractMethod(sub1,sub2);
			
			break;
			
		case 2:
			
			System.out.println("Enter the first number:");
			int mul1=sc.nextInt();
			
			System.out.println("Enter the Second number:");
			int mul2=sc.nextInt();
			
			method.mutiplyMethod(mul1, mul2);

			break;

		case 3:

			System.out.println("Enter the first number:");
			int div1=sc.nextInt();
			
			System.out.println("Enter the Second number:");
			int div2=sc.nextInt();
			
			method.divisionMethod(div1, div2);
			break;

		case 4:

			System.out.println("Enter the number:");
			int rev=sc.nextInt();
			
			method.reverseMethod(rev);
			break;
			
		case 5:

			System.out.println("Enter the number:");
			int factorial=sc.nextInt();
			
			method.factorialMethod(factorial);
			break;

		default:
			System.out.println("Entered choice is not in list");

		}

		

	}
}
