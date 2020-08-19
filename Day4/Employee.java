package Day4;

import java.util.Scanner;

public class Employee {

	
	static String name;
    static int age;

    public static void main(String[] args){

        System.out.println("Please enter name of employee");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Please enter age of employee");
        age = sc.nextInt();

        if(age<55)
            System.out.println(name+" is not eligible for pension");
        else
            System.out.println(name+" is eligible for pension");
        
    }
}
