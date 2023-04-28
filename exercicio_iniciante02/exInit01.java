package exercicio_iniciante02;
import java.util.Scanner;

public class exInit01 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
