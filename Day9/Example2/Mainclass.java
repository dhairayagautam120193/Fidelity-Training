package Example2;

public class Mainclass {

	public static void main(String[] args) {
				
		String str="My Book class";
		
		MyBook mybook = new MyBook();
		
		mybook.setTitle(str);
		
		System.out.println(mybook.getTitle());
	}
}
