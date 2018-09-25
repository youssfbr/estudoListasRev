package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Declarar uma lista de n�mero inteiros.
		List<Integer> listInt;
		
		/*
		 * A lista n�o aceita tipos primitivos.
		 * 
		 *  Instancia��o
		 *  
		 *  List<String> list = new List<>() {
		 *  
		 *  O java n�o aceita. Para instaciar uma interface vou ter que usar uma classe que implementa uma interface como ArrayList
		 *  No caso da List uma classe que implementa � a ArrayList
		 *  
		 * */

		List<String> list = new ArrayList<>();
				
		/*
		 * A ArrayList � otimizada. Ela pega as melhores caracter�stica do vetor e da Lista.
		 * 
		 * Para instanciar uma lista poderia ter usado <Tipo>
		 * 
		 * List<String> list = new ArrayList<String>();
		 * 
		 * Mas de umas vers�es do Java pra c� ficou opcional, deixando o c�digo mais limpo.
		 * 
		 * */		
	}
}
