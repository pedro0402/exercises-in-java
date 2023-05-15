package atividade_dolar;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();

		System.out.print("How many dollar will be bought? ");
		double dolarQuantity = sc.nextDouble();

		double result = CurrencyConverter.dollarPayment(dolarPrice, dolarQuantity);

		System.out.printf("Amount to be paid in reais = %.2f\n ", result);

		sc.close();
	}

}
