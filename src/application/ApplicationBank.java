package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Account;

public class ApplicationBank {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta = new Account();
		
		System.out.println("Enter account Number: ");
		int numConta = sc.nextInt();
		conta.setAccountNumer(numConta);
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
	    conta.setName(name);
		
		System.out.println("Enter initial deposit value (y/n): ");
		char deposYn = sc.next().charAt(0);
		
		if (deposYn == 'y'){
			System.out.println("Enter initia value: ");
			double valor = sc.nextDouble();
			conta.depositAccount(valor);;	
			System.out.println(conta);
			
			
		}
		
		System.out.println("Enter the deposit in value:");
		double valorDep = sc.nextDouble();
		conta.depositAccount(valorDep);
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Enter the withdra in value:");
		double valorSaque = sc.nextDouble();
		conta.saqueAccount(valorSaque);
		System.out.println(conta);
		
		sc.close();
		
		
		
		

	}

}
