package exercicio_iniciante04;

import java.util.Scanner;

public class ExInit07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int first = i;
			int second = i * i;
			int third = i * i * i;
			System.out.printf("%d %d %d\n", first, second, third);
		}
		sc.close();
	}
}
