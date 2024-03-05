package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número da operação: ");
		String numA = entrada.next().replace(",", ".");

		System.out.print("Digite o segundo número da operação: ");
		String numB = entrada.next().replace(",", ".");

		System.out.print("Digite o sinal da operação: ");
		String sinal = entrada.next();

		double num1 = Double.parseDouble(numA);
		double num2 = Double.parseDouble(numB);

		// sinal = sinal.trim();

		String resultado = sinal.equals("+") ? "" + (num1 + num2) : "";

		resultado = sinal.equals("-") ? "" + (num1 - num2) : resultado;

		resultado = sinal.equals("*") ? "" + (num1 * num2) : resultado;

		resultado = sinal.equals("/") ? "" + (num1 / num2) : resultado;

		resultado = sinal.equals("%") ? "" + (num1 % num2) : resultado;

		String invalido = "O sinal da operação digitado é inválido";

		resultado = resultado.equals("") ? invalido : resultado;

		resultado = resultado.equals(invalido) ? resultado : num1 + " " + sinal + " " + num2 + " = " + resultado;

		System.out.println(resultado);

		entrada.close();

	}

}
