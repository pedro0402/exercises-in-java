package exercicio_iniciante02;
import java.util.Scanner;

public class exInit06 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();
		String interval;
		
		if ( num <= 25.0) {
			interval = "[0, 25]";
		} else if (num <= 50) {
			interval = "[25, 50]";
		} else if (num <= 75) {
			interval = " [50, 75]";
		} else if ( num <= 100) {
			interval = " [75, 100]";
		} else {
			interval = "Out of interval.";
		}
		
		System.out.println("The number is in a interval of " + interval );
		sc.close();
	}
}
