package Example3;

import java.util.Scanner;

class Mainclass {

	public static void main(String[] args) {
		
		MyCalculator mycal= new MyCalculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int n= sc.nextInt();
		if(n>1000){
			
			System.out.println("Maximum limit exceeded");
		}
		else{
		System.out.println(mycal.divisor_Sum(n));
		}
	}
	
}
