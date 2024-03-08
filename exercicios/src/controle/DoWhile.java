package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "por favor";
		
		// A diferenã do "Do While" para o "While", é que o "Do While" será executado pelo menos
		// uma vez independente da condição ser verdadeira ou falsa, enquanto o "While" só será executado
		// se a condição for verdadeira.
		do {
			
			System.out.println("Você tem que dizer as palavras mágicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Ok, obrigado!");
		entrada.close();
	}
	
}
