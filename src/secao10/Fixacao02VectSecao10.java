package secao10;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProductVect;

public class Fixacao02VectSecao10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVect[] vect = new ProductVect[n];
		for (int i=0; i<vect.length; i++){
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new ProductVect(name, price);
			
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++){
			sum += vect[i].getPrice();
		}
	
		double avg = sum /vect.length;
		System.out.printf("Average price = %.2f%n" , avg);
		
      sc.close();
	}

}
