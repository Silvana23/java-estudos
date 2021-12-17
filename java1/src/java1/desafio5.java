package java1;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in) ;

		System.out.println("qual o preco do dolar?");
		double valor = sc.nextDouble();
		
		System.out.println("quantos dolares voce quer comprar? ");
		 double buy = sc.nextDouble();
		sc.close();
		  
		 double total = valor * buy;
		   
		 double ipost = total *0.06;
		 
		 double pay = total + ipost;
		 System.out.print("TOTAL A PAGAR : ");
		 System.out.println(pay);

	}

}       