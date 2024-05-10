package arrays;

import java.util.Iterator;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = {1, 2, 3, 4};
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		// O comando "foreach" em java é escrito da maneira abaixo. O valor de cada indice 
		// do Array é salvo na variável de tipo "double" (mesmo tipo do array) e de nome "nota":
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
	}
	
}
