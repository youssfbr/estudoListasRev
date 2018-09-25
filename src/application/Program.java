package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Declarar uma lista de número inteiros.
		List<Integer> listInt;
		
		/*
		 * A lista não aceita tipos primitivos.
		 * 
		 *  Instanciação
		 *  
		 *  List<String> list = new List<>() {
		 *  
		 *  O java não aceita. Para instaciar uma interface vou ter que usar uma classe que implementa uma interface como ArrayList
		 *  No caso da List uma classe que implementa é a ArrayList
		 *  
		 * */

		List<String> list = new ArrayList<>();
				
		/*
		 * A ArrayList é otimizada. Ela pega as melhores característica do vetor e da Lista.
		 * 
		 * Para instanciar uma lista poderia ter usado <Tipo>
		 * 
		 * List<String> list = new ArrayList<String>();
		 * 
		 * Mas de umas versões do Java pra cá ficou opcional, deixando o código mais limpo.
		 * 
		 * */		
	}
}
