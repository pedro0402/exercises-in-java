package exercicio_iniciante02;
import java.util.Scanner;

public class exInit02 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		sc.close();
	}
}
