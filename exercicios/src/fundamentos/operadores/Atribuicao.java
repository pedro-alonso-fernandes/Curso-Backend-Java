package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 6;
		
		b += a; // b = b + a;
		System.out.println(b);
		b -= a; // b = b - a;
		System.out.println(b);
		b *= a; // b = b * a;
		System.out.println(b);
		b /= a; // b = b / a;
		System.out.println(b + "\n");
		
		b %= 2; // b = b % 2; 0 ou 1
		System.out.println(b);
		
		// Dica: a expressão "x % 2" pode ser usada para saber se o número "x" é ímpar ou par.
		// Se o resultado da expressão for "0" o número "x" é par, se o resultado for "1" o número
		// "x" é ímpar.
		
	}
	
}
