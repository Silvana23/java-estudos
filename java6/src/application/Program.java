package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BussinesException;

public class Program extends Account {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("informe os dados da conta");
		
     System.out.print("numero da conta: ");
     int number = sc.nextInt();
     
     System.out.print("nome do titular: ");
     sc.nextLine();
     String holder = sc.nextLine();
     
     System.out.print("saldo inicial");
     Double balance = sc.nextDouble();
     
     System.out.print("limite de saque");
     Double withdrawLimit = sc.nextDouble();
     
     Account acc= new Account( number, holder, balance, withdrawLimit);
     System.out.println("*********************************************");

     System.out.println("informe uma quantia para saque");
     Double amount = sc.nextDouble();
     
     try {
     acc.withdraw = (amount);
     System.out.printf("novo saldo :%.2f%n " , acc.getBalance() );
     }
     
     catch(BussinesException e) {
    	System.out.println(e.getMessage());
     }
     
     sc.close();
}
}