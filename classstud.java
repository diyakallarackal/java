package pro3;
import java.util.Scanner;
public class class1 {
	String name;
	int rollno;
	int age;
	
	void displaydetails() {
		
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Age : "+age);
	}
	public static void main(String [] args) {	
		Scanner sc = new Scanner(System.in);
		class1 Student1 = new class1();
		System.out.println("Enter name: ");
		Student1.name=sc.nextLine();
		System.out.println("Enter age: ");
		Student1.age=sc.nextInt();
		System.out.println("Enter rollno:");
		Student1.rollno=sc.nextInt();
	    Student1.displaydetails();
	}		
}
