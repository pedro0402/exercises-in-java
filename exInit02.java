package exercicio_iniciante01;
import java.util.Scanner;

public class exInit02 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		double raio;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("O valor da área é de %.4f", area);
		sc.close();
	}

}
