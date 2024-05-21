package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem a turma?");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = entrada.nextInt();
		
		// Para representar uma matriz em java utiliza-se um Array dentro de outro Array, 
		// onde o primeiro array representa as linhas(i) e o segundo representa as colunas(j): 
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int i = 0; i < notasTurma.length; i++) {
			for(int j = 0; j < notasTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
				notasTurma[i][j] = Double.parseDouble(entrada.next().replace(",", ".")); // Possibilita informar números decimais usando vírgula ou ponto.
				total += notasTurma[i][j];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		
		System.out.printf("\nA média de notas da turma é: %.1f \n", media);
		
		for(double[] notas: notasTurma) {
			System.out.println(Arrays.toString(notas));
		}
		
		entrada.close();
		System.out.println();
	}
}
