package pro3;
import java.util.Scanner;
public class mark {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark:");
		int marks = sc.nextInt();
		if (marks>=90) {
			System.out.println("Grade A");
		}
		else if (marks>=75) {
			System.out.println("Grade B");
		}
		else if (marks>=60) {
			System.out.println("Grade C");
		}
		else if (marks>=40) {
			System.out.println("Grade D");
		}
		else if (marks<40) {
			System.out.println("Failed");	
		}
		else {
			System.out.println("Invalid entry");	
		}
		sc.close();
		
		
	}

}
