package Day6;

import java.util.Scanner;

interface Area{
	
	public double calculateArea(double length,double breath);
}
public class Rectangle implements Area{

	public double calculateArea(double length, double breadth){
		
		double result=length*breadth;
		return result;
	}
	public static void main(String[] args) {
		
		Rectangle area= new Rectangle();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length: ");
		double len=sc.nextDouble();
		System.out.println("Enter the breath: ");
		double breadth=sc.nextDouble();
		
		
		System.out.println("Area of rectangle is: "+area.calculateArea(len, breadth));
	}
}
