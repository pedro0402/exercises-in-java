package exercicio_iniciante02;
import java.util.Scanner;

public class exInit05 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1- HOT DOG U$4.00\n"
				+ "2- X-Salad U$4.50\n"
				+ "3- X-Bacon U$5.00\n"
				+ "4- Toasted Bread U$2.00\n"
				+ "5- Soda U$1.50");
		
		System.out.print("Enter food code: ");
		int code = sc.nextInt();
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		
		double total = 0;
		if (code == 1) {
			total = quantity * 4.00;
		} else if (code == 2) {
			total = quantity * 4.50;
		} else if (code == 3) {
			total = quantity * 5.00;
		} else if (code == 4) {
			total = quantity * 2.00;
		} else if (code == 5) {
			total = quantity * 1.50;
		}
		
		System.out.printf("Final price: U$ %.2f\n", total);
		sc.close();
	}
}
