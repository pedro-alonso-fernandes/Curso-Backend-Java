package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Caneta", 7.00, 0.1);
		// O método "accept" executa o "Consumer"
		imprimirNome.accept(p1);
		Produto p2 = new Produto("Caderno", 20.00, 0.18);
		Produto p3 = new Produto("Notebook", 2700.00, 0.25);
		Produto p4 = new Produto("Lápis", 5.00, 0.19);
		Produto p5 = new Produto("Borracha", 4.00, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome); // Como o forEach recebe um "Consumer" apenas passá-lo já basta
		produtos.forEach(p -> System.out.println(p.preco)); // Mas também pode ser feito manualmente
		produtos.forEach(System.out::println); // Aqui o forEach vai tentar printar cada produto direto
		// (System.out.print(p)), o que executará o método "toString" da classe Produto caso ela tenha
	}
}
