package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product;





public class Progam67 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Price:");
		double price = sc.nextDouble();
		System.out.println("Quantity in Stock:");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price);
		System.out.println("Product Data:" + product.getName());
		
		product.setName("Computador");
		System.out.println("Update Data:" + product.getName());
		
		System.out.println();
		System.out.println("Enter the number of product to be added in stock: ");
		
		quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
        System.out.println("Update Data:" + product);
        
        System.out.println();
		System.out.println("Enter the number of product to be removed in stock: ");
		
	    quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
        System.out.println("Update Data:" + product);
		
		
	
		sc.close();

	}

}
