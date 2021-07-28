package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula95ListParte2 {

	public static void main(String[] args) {
		
      List<String> list = new ArrayList<>();
      list.add("Maria");   //(Adicionar)
      list.add("Alex");
      list.add("Bob");
      list.add("Anna");
      
      list.add(2,"Marco");  //(Utilizei a sobrecarga)
     // list.remove("Anna");
      
       System.out.println(list.size());
       System.out.println("Index of Bob:" + list.indexOf("Bob"));     
 
      for (String x : list){
    	  System.out.println(x);
      }
      
      System.out.println("------------------");
      
      //list.remove(1);
     
      System.out.println(list.size());
      
      for (String x : list){
    	  System.out.println(x);
      }
      
      System.out.println("------------------");
      System.out.println("Quero remover da lista todos os Elmentos que atendam a um Predicado:");
      System.out.println("Todos que iniciem com a letra M ... Deve retornar Verdadeiro ou Falso: ");
      System.out.println("------------------");
      
      list.removeIf(x -> x.charAt(0) =='M');  //Funcao Lambida (Predicado .. Retorna V ou F)
      
      for (String x : list){
    	  System.out.println(x);
      }
      System.out.println("------------------");
      System.out.println("Agora vammos fazer busca na Lista por Indices ");
      System.out.println("Index of Bob:" + list.indexOf("Bob"));
      
      System.out.println("Index of Bob:" + list.indexOf("Marco")); //Este nao tem na lista
      
      System.out.println("------------------");
      
      List <String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
     
      for (String x : result){
    	  System.out.println(x);
      }
      
      System.out.println("------------------");
      System.out.println("Pegar o Primeiro da Lista que Inicie com a letra A");
      String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
      System.out.println(name);
      
      System.out.println("------------------");
      System.out.println("Pegar o Primeiro da Lista que Inicie com a letra J");
      String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
      System.out.println(name1);
	}

}
