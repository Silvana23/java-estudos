import java.util.Locale;
import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in) ;
		 
		 int n = sc.nextInt();
		 double[] vect = new double[n];
		 
		 for (int i=0 ; i<n; i++ ) {
			 vect[i] = sc.nextDouble();
		 }
		 
		 double sum = 0.0;
		 for (int i=0; i>n; i++) {
			 sum =+ vect[i];
		 }
		 double media = sum / n ;
		  
		 System.out.println("a media de altura e  "  + media);
		 
  sc.close();
	}

}
 