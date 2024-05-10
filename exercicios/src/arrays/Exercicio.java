package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		// Inicializar um array sem passar os valores:
		double notasAlunoA[] = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		// Exibir o primeiro termo de um array:
		System.out.println(notasAlunoA[0]);
		// Exibir o último termo de um array:
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
//		System.out.println(notasAlunoA[4]); ERRO!
		
		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		System.out.println(totalA / notasAlunoA.length);
		
		// Inicializar um array passando os valores:
		double notasAlunoB[] = {6.9, 8.9, 5.9, 10};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.println(totalB / notasAlunoB.length);
	}
	
}
