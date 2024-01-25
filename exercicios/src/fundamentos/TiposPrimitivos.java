package fundamentos;

public class TiposPrimitivos {

	public static void main(TipoString[] args) {
		
		// Existem 8 tipos primitivos no java: byte, short, int, long, float, double, char, boolean.
		// Os tipos byte, short, int e long; são para números inteiros. A diferença entre eles é o espaço ocupado na mémoria.
		// Os tipos float e double são para números reais. A diferença entre eles também é o espaço ocupado na memória.
		// O tipo char é para caracteres, porém só se pode salvar um carctere por variável.
		// O tipo boolean salva apenas "true" ou "false", ouse seja, "verdadeiro" ou "falso".
		
		byte numByte = 23;
		short numShort = 345;
		int numInt = 2_333_875;
		// Para o java reconhecer que um valor literal é do tipo long, é necessário coloar um "L" no final do número:
		long numLong = 10_000_000_000_000L;
		
		// Para o java reconhecer que um valor literal é do tipo float, é necessário coloar um "F" no final do número:
		float numFloat = 3.567F;
		double numDouble = 7.232332;
		
		char caractere = 'A';
		// Também é possível salvar um caractere atráves do seu código unicode:
		char unicode = '\u0064';
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("Número byte: " + numByte);
		System.out.println("Número short: " + numShort);
		System.out.println("Número int: " + numInt);
		System.out.println("Número long: " + numLong);
		System.out.println("Número float: " + numFloat);
		System.out.println("Número double: " + numDouble);
		System.out.println("Caractere char: " + caractere);
		System.out.println("Caractere char usando unicode: " + unicode);
		System.out.println("Boolean verdadeiro: " + verdadeiro);
		System.out.println("Boolean falso: " + falso);
		
	}
}
