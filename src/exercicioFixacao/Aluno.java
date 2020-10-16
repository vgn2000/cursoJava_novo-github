package exercicioFixacao;

public class Aluno {
	
	public String name;
	public double notas1, notas2, notas3;
	
	
	
	public double mediaGeral(){
		
		double resultado;
		
		resultado = notas1 + notas2 + notas3;
		
		return resultado;
	}
	
	public void resultadoFinal(double media){
		
		double failed = 60;
		
		if (media > 60){
			System.out.println("Final Grade = " + media);
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Final Grade = " + media);
			System.out.println("Failed");
			double resul = failed - media ;
			System.out.println("Missing " + resul + " Points");
			
		}
		
	}
	

}
