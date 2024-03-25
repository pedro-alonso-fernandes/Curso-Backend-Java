package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		// Quando cria-se uma variável de tipo primitivo, o valor dela é salvo
		// direto na memória. Assim, quando se coloca que uma variável é 
		// igual a outra (assim como na linha 13), o java faz duas cópias diferentes. 
		// Dessa forma, quando uma variável é alterada, a outra permanece 
		// do jeito que está (assim como acontece a seguir).
		int a = 2;
		int b = a;
		
		a++;
		b--;
		System.out.println(a + " " + b);
		
		// Quando cria-se um objeto, ele é salvo na memória do computador através de 
		// referências hexadecimais (um endereço para outra parte da memória).
		// Assim, quando se coloca que um objeto é igual ao outro (assim como na linha 25),
		// os dois objetos ficam salvos com o mesmo endereço. Dessa forma, quando se altera um
		// objeto, a alteração ocorre nos dois objetos (assim como acontece a seguir).
		Data d1 = new Data(2, "11", 2024);
		Data d2 = d1;
		
		d1.dia = 5;
		d2.ano = 2005;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		// A mesma coisa acontece se o objeto for passado e alterado no método:
		voltarDataPadrao(d2);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		// Já com variáveis de tipo primitivo, isso não acontece:
		int c = 2;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = "1";
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int c) {
		c = 10;
	}
	
}
