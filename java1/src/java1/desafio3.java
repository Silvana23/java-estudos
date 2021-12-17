package java1;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in) ;
	
		System.out.println("digite o nome do funcionario : ");
		String nome  = sc.next(); 
		
		System.out.println("digite o  salario bruto : ");
		int salario  = sc.nextInt(); 
		
		System.out.println("digite o desconto a ser calculado : ");
		int desconto  = sc.nextInt(); 
		
		int recebe = salario - desconto;
		
		System.out.printf(" %s recebe  R$%d%n " , nome ,recebe);
		
		System.out.println("digite valor para reembolso ao funcionario : ");
		 int reembolso = sc.nextInt();
		 
		int total = recebe + reembolso;
		
		System.out.printf(" valor atualizado do salario liquido : R$%d "  , total);
		
		
		
		sc.close();
	} 

}
