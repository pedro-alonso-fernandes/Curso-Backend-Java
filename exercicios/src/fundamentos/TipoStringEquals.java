package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		// Ao usar o scanner com ".next()", o java salvará a string digitada sem espaços.
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2);
		System.out.println("2".equals(s2));
		
		// Já ao usar o scanner com ".nextLine()", o java salvará a string do jeito que foi digitada
		entrada.nextLine();
		String s3 = entrada.nextLine();
		System.out.println(s3);
		// O comando ".trim()" tira os espaços de uma string.
		System.out.println("2" == s3.trim());
		System.out.println("2".equals(s3.trim()));
		
		entrada.close();
		
	}
	
}
