package application;

import java.util.Scanner;

public class Desafio11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um valor para o tamanho da  linha da matriz");
		
		int m = sc.nextInt();
		System.out.println("digite um valor para  o tamanho da coluna da matriz");
		int n = sc.nextInt();
		 int [][] mat = new int[m][n];
		 
		 for(int i=0; i<m ; i++) {
			 System.out.println("digite um valor para a linha da   matriz");
		   System.out.println();
			 for(int j =0 ; j<n; j++) {
				 System.out.println("digite um valor para a coluna da matriz");
				   System.out.println();

				 mat [i][j]= sc.nextInt();
			 }
				 for(int i1=0; i1<m; i1++) {
					 for(int j=0; j<n; j++) {
						 System.out.print(mat[i1][j] +  " ");
						
					 }
					 
					 System.out.println( " ");
				 }
			
			 } 
			 
			sc.close();

			 }
		 
		 
	}


