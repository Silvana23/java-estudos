import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		  System.out.println("digite um numero");
		Scanner sc = new Scanner (System.in);
		  
		int a = sc.nextInt();
		  
		  System.out.println("digite um numero");
		  int b = sc.nextInt();
		  
		  System.out.println("digite um numero");
		  int c = sc.nextInt();
		  
		  int higher = max(a,b,c);
		  
		  showResult(higher);
		  
		  sc.close();
		  
}
          public static int max( int a , int b , int c) {
        	  int aux;
        	  if (a>b && a>c) {
        		  aux =a;
        	  }else if (b>c) {
        		  aux = b;
        	  } else {
        		  aux = c;
        	  }
        	  return aux;
          }
         public static void showResult (int value) {
        	 System.out.println("higher = " +value);
         }
}
