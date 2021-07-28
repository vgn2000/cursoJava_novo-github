package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Account;

public class ApplicationBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter Account Number:"  );
		int number = sc.nextInt();

		
		System.out.print("Enter Account Holder: "  );
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		System.out.print("Enter initial deposit value (Y/N): "  );
		char answer = sc.next().charAt(0);
		
		if (answer =='y'){
			System.out.println();
			System.out.print("Enter a initial deposit value: "  );
		
	     	double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			System.out.println();
			
			
		}
		else {
	
			account = new Account(number, holder);
			
		}
		
		
		System.out.print("Enter a deposit value: "  );
		double depositValue = sc.nextDouble();
		account.depositAccount(depositValue);
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: "  );
		double withValue = sc.nextDouble();
		account.saqueAccount(withValue);
		System.out.println(account);
		
		
		sc.close();
		

	}

}
