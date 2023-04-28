package exercicio_iniciante02;
import java.util.Scanner;

public class exInit03 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();  
		System.out.print("Enter a number: ");
		int num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("They are multiple");
		} else {
			System.out.println("They aren`t multiple");
		}
		sc.close();
	}
}
