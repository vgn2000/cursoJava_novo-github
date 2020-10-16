package exercicioFixacao;

public class CurrencyConverter {
	
	
	public static double price;
	public static double quantity;
	public static final double IOF = 0.06;
	
	
	public static double valorDollar(double valor){
	
		price = valor + (valor * IOF);
		return price;
			
			
	}
	
	
	public static double quantyDollar (double qt){
		double resultDollar;
		
		resultDollar = price * qt;
		
		return resultDollar;
		
		
	
	}

}
