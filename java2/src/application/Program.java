package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
	
		System.out.println(" enter departament s name ");
		String departamentName = sc.nextLine();
		System.out.print("enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("base salary : ");
		double baseSalary = sc.nextDouble();

  sc.close();
	}

}
