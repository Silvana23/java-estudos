package desafio7;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product[] vect= new Product[10];
		System.out.println("quantas pesoas vao alugar quartos?");
		int n = sc.nextInt();
		
		for (int i =1; i<= n; i++) {
			
			System.out.println();
			System.out.println("ALUGUEL #" + i + ":");
			System.out.print("NOME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("QUARTO: ");
			int room = sc.nextInt();
			vect[room] = new Product(name, email);
			
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
		}}

		
sc.close();	
}
}

