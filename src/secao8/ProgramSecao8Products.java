package secao8;

import java.util.Locale;
import java.util.Scanner;

import entidades.Product;

public class ProgramSecao8Products {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter Product Data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		Product product = new Product(name, price);
		

		product.setName("Computador");
		System.out.println("Update Product:  " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Update Price " + product.getPrice());
		
		//System.out.println(product.name + " " + product.price + " " + product.quantity);
		System.out.println();
		
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
        System.out.println();
		System.out.println("Updated data: " + product);

		
		System.out.println();
		System.out.println("Enter the number of product to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		
		System.out.println();
		System.out.println("Updated data: " + product);

		
		
		sc.close();
	}

}
