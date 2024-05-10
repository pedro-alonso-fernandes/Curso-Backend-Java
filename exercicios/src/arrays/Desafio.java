package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você quer registrar?");
		int qtd = entrada.nextInt();
		System.out.println();
		
		double[] notas = new double[qtd];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i+1);
			notas[i] = Double.parseDouble(entrada.next().replace(",", "."));
		}
		
		double total = 0;
		for(double i: notas) {
			total += i;
		}
		
		double media = total / qtd;
		System.out.printf("\nA média das notas informadas é %s", String.valueOf(String.format("%.2f", media)).replace(".", ",") );
		
		entrada.close();
	}
}
