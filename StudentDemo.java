package pro3;
import java.util.Scanner;
class Stud {
	String name;
	int rollno,m1,m2,m3;
	float avg;
	Stud(String name,int rollno,int m1,int m2,int m3){
		this.name=name;
		this.rollno=rollno;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	public void calculateAverage() {
		 avg=(m1+m2+m3)/3;
	}
	void displaydetails() {
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Mark for sub1 : "+m1);
		System.out.println("Mark for sub2 : "+m2);
		System.out.println("Mark for sub3 : "+m3);
		System.out.println("Average : "+avg);
	}
}
public class Studentdet {
	public static void main(String [] args) {	
		int rollno;
		String name;
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter rollno:");
		rollno=sc.nextInt();
		System.out.println("Enter mark for sub1: ");
		m1=sc.nextInt();
		System.out.println("Enter mark for sub2: ");
		m2=sc.nextInt();
		System.out.println("Enter mark for sub3: ");
		m3=sc.nextInt();
		Stud s1= new Stud(name,rollno,m1,m2,m3);
		s1.calculateAverage();
	    s1.displaydetails();
}

}
