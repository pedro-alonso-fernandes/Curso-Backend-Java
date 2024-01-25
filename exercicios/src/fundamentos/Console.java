package fundamentos;

// Biblioteca do Scanner
import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		// O "%n" tem a mesma função de um "\n", ou seja, pular linha:
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		// Scanner é usado para pegar informações digitadas pelo usuário através do console.
		Scanner leitor = new Scanner(System.in);
		
		// Para pegar essas inforrmações, é preciso colocar o comando respectivo ao tipo de dado informado:
		System.out.print("\nDigite seu nome: ");
		// Tipo String:
		String nome = leitor.nextLine();
		
		System.out.print("Digite sua idade: ");
		// Tipo int:
		int idade = leitor.nextInt();
		
		System.out.print("Digite seu saldo bancário: ");
		// Tipo float:
		float saldo = leitor.nextFloat();
		
		System.out.printf("\n%s tem %d anos e possuí R$%.2f reais no banco.", nome, idade, saldo);
		
		// Esse comando encerra a atividade do Scanner no código:
		leitor.close();
	}
}
