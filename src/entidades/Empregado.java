package entidades;

public class Empregado {
	
	private int id;
	private String name;
	public double grossSalary;

	
	
	public Empregado() {
		
	}


	public Empregado(int id, String name, double grossSalary) {
		
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
		
	}

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getGrossSalary() {
		return grossSalary;
	}


	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}


	public double netSalary(){
		
		return grossSalary ;
	}
	
	public void increaseSalary(double percentual){
		
		this.grossSalary += grossSalary * percentual / 100.0;
		
	}
	
	public String toString(){
		
		return id
				+ "   , "
				+ name
				+ "  ,  "
				+ String.format("%.2f", netSalary());
				
			
	}



}



