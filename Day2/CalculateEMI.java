package Day2;

import java.util.Scanner;

public class CalculateEMI {

	//WAP TO CALCULATE MONTHLY EMI
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		
		System.out.println("Enter the rate of interest");
		int rate=sc.nextInt();
		
		System.out.println("Enter the timeperiod");
		int years=sc.nextInt();
		
		int emi=(amount*rate*years)/100;
		
		System.out.println("Monthly EMI is "+emi);
		
		
	}
}
