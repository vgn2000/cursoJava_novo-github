package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListAula93 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		for (String x : list){
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list){
			System.out.println(x);
		}
		
		System.out.println("IndexOf Bob:" + list.indexOf("Bob"));
		System.out.println("IndexOf Marco: " + list.indexOf("Marco"));
		System.out.println("------------------");
		System.out.println("Esta foi a forma que o Java 8 encontrou de trabalhar com List (Antigo)");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result ){
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);
		
	}

}
