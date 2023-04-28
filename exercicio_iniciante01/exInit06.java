package exercicio_iniciante01;
import java.util.Scanner;

public class exInit06 { 
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double A, B, C;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite 3 valores: ");
		System.out.print("Primeiro valor: ");
		A = sc.nextDouble();
		System.out.print("Segundo valor: ");
		B = sc.nextDouble();
		System.out.print("Terceiro valor: ");
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		circulo = 3.14159 * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f", retangulo);
		sc.close();
	}

}
