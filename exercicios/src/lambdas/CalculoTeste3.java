package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	// Já nesse teste, foi usado lambda para definir o método "apply" da interface "BinaryOperator" do java.
	// Ela recebe dois parâmetros do mesmo tipo e retorna um valor do mesmo tipo.
	public static void main(String[] args) {
		
		// NÃO: int -> Double
		// SIM: double -> Double
		
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));
	
	}
}
