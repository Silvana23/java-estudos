package media;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Desafio {

public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		//Package[] vect= new Package[0];
		
		System.out.println("quantos funcionarios para ser registrados ? ");
		
		int n = sc.nextInt();
		

		for (int i =1; i<= n; i++) {
			
			System.out.println();
			
			System.out.println("EMPLYOEE #" + i + ":");
			
			System.out.println("ID: ");
			 int id = sc.nextInt();
			 
			System.out.println("NOME : ");
			String name = sc.nextLine();

			System.out.printf("salario: ");
			double salary = sc.nextDouble();
			

			sc.close();
}
}
}