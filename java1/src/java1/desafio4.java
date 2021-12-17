package java1;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in) ;
		 
		System.out.println("digite o nome do aluno : " );
		 String nome = sc.next();
		 
		 System.out.printf("digite a nota do primeiro bimestre de %s " , nome);
		  int nota1 = sc.nextInt();
		  
		  System.out.printf("digite a nota do segundo bimestre de %s " , nome);
		  int nota2 = sc.nextInt();
		  
		  System.out.printf("digite a nota do terceiro bimestre de %s " , nome);
		  int nota3 = sc.nextInt();
		  int res = nota1 +nota2+ nota3 ; 
		  
		      int falta = (60  - res); 
		  if(res < 60) {
			  System.out.printf("%s esta reprovado  faltam %d%n pontos para aprovacao" , nome, falta);
		  }else {
			  System.out.println(" aprovado ");
	
		  sc.close();
		  }
   }
}

  
		 
		   	 
	         