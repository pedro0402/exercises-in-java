package exercicio_iniciante03;
import java.util.Scanner;

public class ExInit01 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		int password = sc.nextInt();
		while (password != 2002) {
			System.out.println("Wrong Password.");
			password = sc.nextInt();
		}
		System.out.println("Allowed Access.");
		sc.close();
	}
}
