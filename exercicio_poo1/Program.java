package exercicio_poo1;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n" , retangulo.Area());
		System.out.printf("PERIMETER = %.2f\n" , retangulo.Perimeter());
		System.out.printf("DIAGONAL = %.2f\n" , retangulo.Diagonal());
		
		sc.close();
	}

}
