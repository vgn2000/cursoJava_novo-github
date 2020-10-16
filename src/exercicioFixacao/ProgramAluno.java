package exercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluno {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 3 grades: ");
		Aluno aluno = new Aluno();
		
		aluno.notas1 = sc.nextDouble();
		aluno.notas2 = sc.nextDouble();
		aluno.notas3 = sc.nextDouble();
		
		double media = aluno.mediaGeral();
		
		aluno.resultadoFinal(media);
		
		sc.close();
		

	}

}
