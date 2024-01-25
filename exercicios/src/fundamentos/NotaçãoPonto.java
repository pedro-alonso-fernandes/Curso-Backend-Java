package fundamentos;

public class NotaçãoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		// O "concat" concatena uma string com outra, ou seja, ele junta as duas
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Boa noite Y".toUpperCase().replace("Y", "Jeremias").concat(" Gonzalves");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
