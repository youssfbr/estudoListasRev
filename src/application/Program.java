package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {		
		
		List<String> list = new ArrayList<>();
				
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");		
		
		System.out.println(list.size());		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Remover todos que começam com a letra M.");
		
		// Removendo elemento da lista que atendam a um predicado
		// Remover todo mundo que começa com a letra M.
		
		list.removeIf(x -> x.charAt(0) == 'M'); // Função lambda - Predicado - Retorna em V ou F
		
		System.out.println(list.size());		
		
		for (String x : list) {
			System.out.println(x);
		}	
			
	}
}
