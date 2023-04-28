package exercicio_iniciante01;
import java.util.Scanner;

public class exInit05 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int codPecas1, numPecas1, codPecas2, numPecas2;
		float valorPecas1, valorPecas2;
		float soma;
		
		System.out.print("Código da peça: ");
		codPecas1 = sc.nextInt();
		System.out.print("Número de peças: ");
		numPecas1 = sc.nextInt();
		System.out.print("Valor da peça: ");
		valorPecas1 = sc.nextFloat();
		
		System.out.print("Código da peça 2: ");
		codPecas2 = sc.nextInt();
		System.out.print("Número de peças: ");
		numPecas2 = sc.nextInt();
		System.out.print("Valor da peça: ");
		valorPecas2 = sc.nextFloat();
		
		soma = (valorPecas1 * numPecas1) + (valorPecas2 * numPecas2);
		System.out.printf("Valor total: %.2f", soma);
		sc.close();
	}

}
