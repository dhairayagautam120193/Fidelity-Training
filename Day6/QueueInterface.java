package Day6;

interface Queue{
	public void insertMethod();

	public void deleteMethod();
	
	}
class DemoInterface implements Queue{
	
public void insertMethod(){
		
		System.out.println("Insert method for Queue");
		
	}

public void deleteMethod(){
		
	System.out.println("Delete method for Queue");
		
	}
}
public class QueueInterface{
	
	public static void main(String[] args) {
	
	DemoInterface d1 = new DemoInterface();
	
	d1.insertMethod();
	
	d1.deleteMethod();
	}
}
