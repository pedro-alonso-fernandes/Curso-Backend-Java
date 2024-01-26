package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		String valor1, valor2, valor3;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro salário: ");
		valor1 = leitor.nextLine().replace(",", ".");
		
		System.out.print("Digite o valor do segundo salário: ");
		valor2 = leitor.nextLine().replace(",", ".");
		
		System.out.print("Digite o valor do terceiro salário: ");
		valor3 = leitor.nextLine().replace(",", ".");
		
		float num1 = Float.parseFloat(valor1);
		float num2 = Float.parseFloat(valor2);
		float num3 = Float.parseFloat(valor3);
		
		float media = (num1 + num2 + num3) / 3;
		
		System.out.printf("A média dos 3 salarios é de: %.2f", media);
		
		leitor.close();
	}
	
}
