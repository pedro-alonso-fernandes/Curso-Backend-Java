package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		// Obs: a diferença entre essas duas formas de código (colocar os operadores antes ou depois)
		// é que: se colocado antes, o java vai realizar a operação ANTES de prosseguir o código; mas se
		// colocado depois, o java vai realizar a operação DEPOIS de fazer todos os outros comandos de 
		// maior preferência (comandos que estão na mesma linha de código)
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		// A comparação abaixo será verdadeira pois, como mencionado acima, o java aumenta o valor de "a"  
		// ANTES da comparação e diminui o valor de "b" DEPOIS da comparação. Isso acontece por causa que  
		// o "++" foi colocado antes do "a", enquanto o "--" foi colocado depois do "b".
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}
	
}
