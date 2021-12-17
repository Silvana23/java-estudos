package aprendizado;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class construtores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println();
		Products products = new Products(name, price);
		
		
		
		System.out.println("Product data: " + products);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		 int quantity = sc.nextInt();
		products.addProducts(quantity);
		System.out.println();
		
		
		System.out.println("Updated data: " + products);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		products.removeProducts(quantity);
		System.out.println();
		
		
		System.out.println("Updated data: " + products);
		sc.close();
	}
}