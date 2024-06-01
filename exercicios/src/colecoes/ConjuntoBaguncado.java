package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	// O comando abaixo serve para que o java pare de dar avisos (warnings) em todos os erros
	// que foram especificados entre parênteses.
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); // Essa é uma das maneiras de criar uma collection do tipo "set".
		
		// As colections não aceitam valores primitivos, por isso, ao tentar
		// inserir um valor literal primitivo em uma collection, o java automaticamente
		// converte o valor primitivo para o seu respectivo Wrapper (a versão de tipo obejto dos primitivos).
		
		// O comando ".add" serve para adicionar um elemento à collection.
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		// O comando ".size" retorna o tamanho da collection (mesma coisa que o ".length").
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());
		
		// O comando ".remove" remove um elemento da collection.
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet(); // Essa é outra maneira de criar uma collection do tipo "set"
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// O comando ".addAll" faz uma união entre duas collections.
			// conjunto.addAll(nums);
		
		// O comando ".retainsAll" faz uma intersecção entre duas collections.
		conjunto.retainAll(nums); 
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}