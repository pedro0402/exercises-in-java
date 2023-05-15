package atividade_dolar;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarPayment(double a, double b) {
		 return (a * IOF + a) * b;
	}
}
