package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //Conversão implícita
		System.out.println(a);
		
		// Para converter um tipo para outro utilizando cast, basta abrir e fechar parênteses
		// antes do valor e colocar o tipo da conversão dentro do parênteses:
		float b = (float) 1.2323; //Conversão explícita (CAST)
		System.out.println(b);
		
		// Se você tentar converter um número para um tipo que não suporta esse número, ele receberá outro
		// número de acordo com o valor passado:
		int c = 200;
		byte d = (byte) c; //Conversão explícita (CAST)
		System.out.println(d);
		
		// Quando se converte um número com casas de decimais para um número inteiro, o java simplesmente
		// tira as casas decimais e pega apenas os valores inteiros, ou seja, o java não arredonda as casas 
		// decimais de um número no momento da conversão (pelo menos não utlizando cast):
		double e = 1.999999;
		int f = (int) e; //Conversão explícita (CAST)
		System.out.println(f);
	}
}
