package secao10;

import java.util.Locale;
import java.util.Scanner;

public class FixacaoVetorSecao10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for (int i=0; i<n; i++){
			vect[i] = sc.nextDouble();
		}
		
		
		double sum = 0.0;
		for (int i=0; i<n; i++ ){
			sum += vect[i];
			
			
		}
		
		double avg = sum / 3;
		
		System.out.printf("A Media e : %.2f%n",  avg );
		sc.close();
	}

}
