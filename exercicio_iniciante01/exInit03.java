package exercicio_iniciante01;
import java.util.Scanner;

public class exInit03 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.print("Digite um valor para A: ");
		A = sc.nextInt();
		System.out.print("Digite um valor para B: ");
		B = sc.nextInt();
		System.out.print("Digite um valor para C: ");
		C = sc.nextInt();
		System.out.print("Digite um valor para D: ");
		D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("DIFERENÇA: " + diferenca);
		sc.close();
	}
}
