package exercicio_iniciante02;
import java.util.Scanner;

public class exInit04 {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int initGame = sc.nextInt();
		System.out.println("Enter a number: ");
		int finalGame = sc.nextInt();
		
		int duration;
		if (initGame < finalGame) {
			duration = finalGame - initGame; 
		} else {
			duration = 24 - initGame + finalGame;
		}
		System.out.println("The game lasted " + duration + " hours");
		
		sc.close();
	}

}
