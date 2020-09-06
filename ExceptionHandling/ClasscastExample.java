package ExceptionHandling;

class Parent1test {
	   String parentName;
	   Parent1test(String n1){
	      parentName = n1;
	   }
	   public void display() {
	      System.out.println(parentName);
	   }
	}
	class ChildTest extends Parent1test {
	   String childName;
	   ChildTest(String n2) {
	      super(n2);
	      childName = n2;
	   }
	   public void display() {
	      System.out.println(childName);
	   }
	}

public class ClasscastExample {

		   public static void main(String args[]) {
		      ChildTest ct1 = new ChildTest("Jai");
		      Parent1test pt1 = new Parent1test("Adithya");
		      pt1 = ct1;
		      pt1.display();

		      Parent1test pt2 = new Parent1test("Sai");
		      ChildTest ct2 = (ChildTest)pt2;
		   }
		}
	
	

