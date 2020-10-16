package exercicioFixacao;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area(){
		return width * height;
		
		
	}

	public double perimeter (){
		double result;
		result = (width * 2) + (height *2);
		
		return result;
		
	}
	
	public double diagonal (){
		double resulPotencia;
		
		resulPotencia = Math.pow(height, 2.0) + Math.pow(width, 2.0);
		
		return Math.sqrt(resulPotencia);
		
	}
	
	
	
}
