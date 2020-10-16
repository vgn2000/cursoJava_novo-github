package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		
		rect.height = sc.nextDouble();
		rect.width = sc.nextDouble();
		double totalArea = rect.area();
		System.out.printf("Area =  %.2f%n  " , totalArea);
		
		double totalPerimeter = rect.perimeter();
		System.out.printf("Perimeter  = %.2f%n ",  totalPerimeter);
		
		double totalDiagonal = rect.diagonal();
		System.out.printf("Diagonal = %.2f%n " , totalDiagonal);

	}

}
