package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		// A interface funcional "Predicate" recebe um parâmetro e retorna um booleano
		Predicate<Produto> isCaro =		// Quando algo retorna um boleano, é comum colocar "is" no seu nome
				prod -> (prod.preco * (1 - prod.desconto)) > 800; 
		Produto produto = new Produto("Notebook", 4000, 0.40);
		System.out.println(isCaro.test(produto));
	}
}
