package Day5;


class Car{
	
	
	public void display()
	{
	System.out.println("Calling Parent class method:Car");	
		
	}
}

class Mercedes extends Car{
	
	public void display(){
		
		System.out.println("Calling Child class method: Mercedes Display method");
	}
}

class BMW extends Car{
	
public void display(){
		
		System.out.println("Calling Child class method: BMW Display method");
	}
	
}
public class Day5 {

	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.display();
		//Creating object of BMW and taking refrence is of Car
		Car bmw =  new BMW();
		bmw.display();
		
		//Creating object of Mercedes and taking refrence is of Car
				Car mercedes =  new Mercedes();
				mercedes.display();
				
		
	}
}
