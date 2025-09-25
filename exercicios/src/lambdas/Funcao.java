package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// A interface "Function" recebe um parâmetro e retorna um valor, âmbos podendo ser de tipos diferentes 
		Function<Integer, String> parOuImpar = num -> (num % 2) == 0 ? "Par" : "Ímpar";
		Function<String, String> resultadoE = valor -> "O Resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor + "!!!";
		Function<String, String> duvida = valor -> valor + "???";
		
		// A função ".andThen()" faz com que a Function passada na função seja executada logo após a primeira Function,
		// passando como parâmetro o resultado da primeira
		String resultadoFinal1 = parOuImpar.andThen(resultadoE).andThen(empolgado).apply(32);
		// No caso acima, primeiro ele exercuta "parOuImpar" com o número 32, depois ele pega o resultado disso e executa
		// "resultadoE", e por fim pega o resultado disso, executa "empolgado" e recebe o retorno dela.
		
		
		String resultadoFinal2 = parOuImpar.andThen(resultadoE).andThen(duvida).apply(33);
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);
		System.out.println(parOuImpar.apply(32));
	}
}
