package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class ProgramExFixacao95 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How Many Emplyoees will be registered ?");
		int n = sc.nextInt();
		List<Empregado> list = new ArrayList<>();
		
		for (int i=0; i<n; i++){
			
			System.out.println("Emplyoee # " + (i + 1));
			
			
			System.out.println("Informe o ID: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)){
				System.out.println("ID already taken ! Try again: ");
				
				id = sc.nextInt();
			}
			
			
			sc.nextLine();
			
			System.out.println("Name:");
			String name = sc.nextLine();
			
			System.out.println("Salario:");
			double salario = sc.nextDouble();
			
			Empregado emp = new Empregado(id, name, salario);
			list.add(emp);
			
			
			
		}
		
		
		System.out.println("Enter the emplyoee id that will salary increase: ");
		int idSalary = sc.nextInt();
		
		
		Empregado emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idSalary);
		
		if (emp == null) {
			
			System.out.println("This id does not exist");
			
		}
		
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
			
		}
			
		
		System.out.println();
		System.out.println("List of employee");
		for (Empregado e: list){
			System.out.println(e);
		}
			
			sc.close();
		

	}
	
	
	public static Integer position(List<Empregado> list , int id){
		
		for (int i=0 ; i<list.size(); i++){
			if (list.get(i).getId() == id){
				return i;
			}
		}
		
		
		return null;
		
	}
	
	
	public static boolean hasId(List<Empregado> list, int id){
		
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp !=null;
		
	}
	
	
}
	

	
		
	


	

	
	

		
	

