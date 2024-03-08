package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		while(!texto.equalsIgnoreCase("Sair")) {
			System.out.println("Digite o que quiser: ");
			texto = entrada.nextLine();
		}
		
		System.out.println("Programa encerrado!");
		
		entrada.close();
	}
	
}
