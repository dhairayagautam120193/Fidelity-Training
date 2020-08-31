package Example4;

class BiCycle {
	
	public void getCycleType() {
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
	}

}

class Motorcycle extends BiCycle{
	public void getCycleType() {
		super.getCycleType();
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
	}
	}


public class Cycle{
	public static void main(String args[]) {
		BiCycle mt = new Motorcycle();
		mt.getCycleType();
	}
}


