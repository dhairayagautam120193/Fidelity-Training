package methodsPackage;

public class Methods {

	public void subtractMethod(int a, int b)
	{		
		int c=a-b;		
		System.out.println("Result for subtraction is: "+c);
	}
	public void mutiplyMethod(int a, int b)
	{		
		int c=a*b;		
		System.out.println("Result for Mutiplication is: "+c);
	}
	
	public void divisionMethod(int a, int b){
		
		int c=a/b;		
		System.out.println("Result for Division is: "+c);
	 	}
	
	public void reverseMethod(int number){
		
		int rev=0;
		
		while(number>0){
			
			int a=number%10;		
			rev=(rev*10)+a;
			number=number/10;
						
		}
		System.out.println("Reverse of a number is: "+rev);
		
	}
	public void factorialMethod(int number) {
		int fact=1;
		for(int i=1;i<=number;i++){
			
			fact=fact*i;
					
		}
		System.out.println("Factorial of "+number+" is: "+fact);
		
	}

	}
