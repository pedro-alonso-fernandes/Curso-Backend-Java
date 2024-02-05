package fundamentos;

public class Aritmeticos {
	public static void main(String[] args) {

		System.out.println(2 + 3);

		var x = 34.56;
		double y = 2.2;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);

		// O símbolo de porcentagem (%) é usado para calcular o resto de uma divisão.
		// Essa operação é chamada de "módulo":
		System.out.println(a % b);
		System.out.println(10 % 3);

		System.out.println(x + y - a * b);

	}
}
