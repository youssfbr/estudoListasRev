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
				
		// Removendo elemento da lista pela posi��o
		list.remove(1);
		
		System.out.println(list.size());		
		
		for (String x : list) {
			System.out.println(x);
		}
			
	}
}
