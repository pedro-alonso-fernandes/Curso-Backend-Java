package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota = 0;
		double total = 0;
		int i = 0;
		
		do {
			
			System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				i++;
			}else if(nota != -1){
				System.out.println("Nota inválida! Digite uma nota válida (de 0 a 10)!");
			}
			
		} while (nota != -1);
		
		if(i == 0) {
			i++;
		}
		double media = total / i;
		
		System.out.printf("A média da turma é de %.2f.", media);
		
		entrada.close();
		
	}
	
}
