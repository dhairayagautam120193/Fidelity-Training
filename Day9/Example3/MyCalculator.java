package Example3;

class MyCalculator implements AdvancedArithmetic {

	int sum=0;
	
	public int divisor_Sum(int n) {
		
		for(int i=1;i<=n;i++){
		
			if(n%i==0){
				
				sum=sum+i;
			}
		
		}
		return sum;
	}

}
