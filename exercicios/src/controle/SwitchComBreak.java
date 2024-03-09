package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		String conceito = "";
		int nota;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a nota: ");
		nota = entrada.nextInt();
		
		// Ao colocar o "break", o java sai do bloco de código atual e continua o programa.
		// Nesse caso, ao chegar no "break", o java sai do switch e executa o resto do programa.
		switch(nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "F";
			break;
		default:
			conceito = "inválido!";
			break;
		}
		
		System.out.println("Conceito " + conceito);
		
		entrada.close();
		
	}
	
}
