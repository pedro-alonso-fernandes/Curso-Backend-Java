package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num < 1000;
		
		// Com o Predicate é possível fazer operações lógicas já que o seu retorno é boleano
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		// No caso acima, ele executa o "isPar" com o número 123, executa o "isTresDigitos" com o mesmo número,
		// compara os dois resultados com "E" lógico e por fim nega o resultado final. 
		
		System.out.println(isPar.or(isTresDigitos).test(123));
		// Já nesse caso segue a mesma lógica, porém usando o "OU" lógico e não negando o resultado final.
	}
}
