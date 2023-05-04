package exercicio_iniciante03;

import java.util.Scanner;

public class ExInit03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1- Alcool " + "2- Gasolina " + "3- Diesel " + "4- Fim");

		int cod = sc.nextInt();
		int alcool = 0;
		int gasol = 0;
		int diesel = 0;

		while (cod != 4) {
			if (cod == 1) {
				alcool += 1;
			} else if (cod == 2) {
				gasol += 1;
			} else if (cod == 3) {
				diesel += 1;
			}
			cod = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasol);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
