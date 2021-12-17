package desafio6;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class media {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite a quantidade de  produto");
	int n = sc.nextInt();
	Product[] vect = new Product[n];
	for (int i=0; i<vect.length; i++) {
		
	sc.nextLine();
	System.out.println("digite po nome do  produto");

	String name = sc.nextLine();
	
	System.out.println("digite o preco do   produto");
 
	
	double price = sc.nextDouble();
	vect[i] = new Product(name, price);
	}
	double sum = 0.0;
	for (int i=0; i<vect.length; i++) {
	sum += vect[i].getPrice();
	}
	double avg = sum / vect.length;
	System.out.printf("AVERAGE PRICE = %.2f%n", avg);
	sc.close();
	}
	}

