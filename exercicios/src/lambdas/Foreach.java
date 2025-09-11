package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		// "Arrays.asList" cria uma lista com os elementos que foram informados
		
		// Usando foreach para percorrer a lista e imprimir os nomes
		System.out.println("Forma tradicional...");
		for(String nome: aprovados)
			System.out.println(nome);
		
		// Usando lambda para definir o método foreach da lista e imprimir os nomes
		System.out.println("\nLambda #01...");
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); });
		
		// Usando method refence para imprimir os nomes
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
	}
}
