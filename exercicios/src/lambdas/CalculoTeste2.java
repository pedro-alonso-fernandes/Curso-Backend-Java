package lambdas;

public class CalculoTeste2 {

	// Já nesse teste, foi usado lambda para definir o método "executar" sem necessariamente
	// criar uma classe para isso.
	public static void main(String[] args) {
		
		// Um lambda pode ser implementado com um corpo delimitado por "{}":
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		
		// Ou sem um corpo e simplesmente retorna o que está depos do "->":
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		// Obs: Vale ressaltar que o java identificou o método "executar" nesses dois lambdas, pois
		// ele é o único método da interface "Calculo".
	}
}
