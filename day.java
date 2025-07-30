package pro3;
import java.util.Scanner;
public class day {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers from 1 to 7:");
		int day =sc.nextInt();
		switch (day) {
		case 1 :
			System.out.println("Day : Sunday");
			break;
		case 2 :
			System.out.println("Day : Saturday");
			break;
		case 3 :
			System.out.println("Day : Monday");
			break;
		case 4 :
			System.out.println("Day : Tuesday");
			break;
		case 5 :
			System.out.println("Day : Wednesday");
			break;
		case 6 :
			System.out.println("Day : Thursday");
			break;
		case 7 :
			System.out.println("Day : Friday");
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		}
	}
}
