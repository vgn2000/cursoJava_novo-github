package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar prices");
		double price = sc.nextDouble();
		
		CurrencyConverter.valorDollar(price); // ja tem o valor do dolar nesta variavel
		
		System.out.println("How manu dollar will be bought");
		
		double qt = sc.nextDouble();
		
		double quantity = CurrencyConverter.quantyDollar(qt);
		
		System.out.printf("Amount %.2f%n" , quantity );

	}

}
