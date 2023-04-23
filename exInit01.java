package exercicio_iniciante01;
import java.util.Scanner;

public class exInit01 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, y, soma;
		
		System.out.print("Digite um valor: ");
		x = sc.nextInt();
		System.out.print("Digite um valor: ");
		y = sc.nextInt();
		soma = x + y;
		System.out.print("A soma é: " + soma);
		sc.close();
	}

}
