package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		// Cada tipo primitivo tem uma versão de objeto, que são chamados de Wrappers.
		// Eles são usados principalmente para converter de um tipo para o outro (o que não é possível 
		// se usar os tipos primitivos normalmente, ao invés de usar os wrappers).
		
		// byte
		Byte b = 100;
		// short
		Short s = 1000;
		// int
		Integer i = 10000;
		// long
		Long l = 100000L;

		// O comando "byteValue" simplesmente exibe o valor do Byte
		System.out.println(b.byteValue());
		// O comando "toString" converte um valor para String
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		// float
		Float f = 123.10F;
		System.out.println(f);

		// double
		Double d = 1234.5678;
		System.out.println(d);

		// boolean
		// O comando "parseBoolean" converte uma string em booleano
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		// char
		Character c = '#'; // char
		System.out.println(c + "...");
	}
}
