package lambdas;

public class CalculoTeste1 {

	// Nessa classe de teste, foram usadas as classes "Somar" e "Multiplicar" para definir
	// o método "executar" da interface "Calculo".
	public static void main(String[] args) {
		Calculo calc = new Somar();
		System.out.println(calc.executar(2, 3));
		
		calc = new Multiplicar();
		System.out.println(calc.executar(2, 3));
	}
}
