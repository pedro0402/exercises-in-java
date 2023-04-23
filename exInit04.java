package exercicio_iniciante01;
import java.util.Scanner;

public class exInit04 {
	public static void main (String[] args) {
		int numFunc, horas;
		double recebe, soma;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número do funcionário: ");
		numFunc = sc.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.print("Digite quanto o funcinário recebe por hora: ");
		recebe = sc.nextDouble();
		
		soma = recebe * horas;
		
		System.out.println("O número do funcionário é: " + numFunc);
		System.out.printf("O sálario é: %.2f", soma);
		sc.close();
		
		
	}

}
