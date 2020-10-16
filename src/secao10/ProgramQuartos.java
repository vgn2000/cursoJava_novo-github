package secao10;

import java.util.Locale;
import java.util.Scanner;

import entidades.Rooms;

public class ProgramQuartos {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rooms[] vect = new Rooms[10];
		
		System.out.println();

		System.out.println("Quantos quartos vcs quer alugar 0 a 9 ?: ");
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++){
			
			System.out.println("Rooms: " + " #" + i);
			sc.nextLine();
			System.out.println();
			System.out.println("Informe o seu nome: ");
			String name = sc.nextLine();
			System.out.println();
			
			System.out.println("Informe o seu email:");
			String email = sc.nextLine();
			

			System.out.println("qual quarto vc quer alugar ?: ");
			int numRoom = sc.nextInt();
			
			vect[numRoom]= new Rooms(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
		}
		}
		sc.close();
		
		
		
		


	}

}
