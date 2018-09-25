package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {		
		
		List<String> list = new ArrayList<>();
				
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");		
		
		for (String x : list) {
			System.out.println(x);
		}			
				
		System.out.println("-----------------------------------------------------------");
		
		//Deixando na lista apenas quem come�a com a letra A.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		/*
		 * Esse comando pega a lista list original, filtra somente os elementos que come�am com letra A e devolve
		 * uma nova lista com esses elementos.
		 * Primeiro converto pra stream,
		 * Depois fa�o a opera��o lambda que quero com o filter
		 * Por �ltimo retorno ele pra lista com o collect...
		 * */

		for (String x : result) {
			System.out.println(x);
		}
	}
}
