package classe;

public class ValoresPadrao {

	// Variáveis globais possuem valores padrões se não forem inicializadas:
	// byte, short, int, long --> 0
	// float, double --> 0.0
	// boolean --> false
	// char --> \u0000
	
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static boolean g;
	static char h;
	
	// Objetos globais também tem valor padrão:
	// Objeto --> null
	static Data I;
	
	public static void main(String[] args) {
		
		System.out.println("Byte = " + a);
		System.out.println("Short = " + b);
		System.out.println("Int = " + c);
		System.out.println("Long = " + d);
		System.out.println("Float = " + e);
		System.out.println("Double = " + f);
		System.out.println("Boolean = " + g);
		System.out.println("Char = " + h);
		System.out.println("Objeto = " + I);
		
		
	}
	
}
