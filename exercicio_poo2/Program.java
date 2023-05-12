package exercicio_poo2;
import java.util.Scanner;

public class Program {
	public static void main (String [] args) {
	
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		
		System.out.println();
		System.out.println("Update data: " + employee);
		
		sc.close();
	}
}
