package java1;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
  System.out.println("digite a altura do retangulo : ");
     int heigher = sc.nextInt();
     
     System.out.println("digite a largura do retangulo : ");
     int width = sc.nextInt();
     
     int area = heigher * width;
      int perimetro = (2* heigher) + (2 * width);
     
     System.out.println(" a area do retangulo e : "  + area);
     
     System.out.println(" o perimetro do retangulo e : " + perimetro);
  
 sc.close();
	}
}
