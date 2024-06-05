package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		// O conjunto do tipo "map" é uma estrutura do tipo chave e valor, onde ao adicionar
		// um elemento, deve-se passar uma chave (para identificar o valor) e um valor.
		// Obs: não é possível adicionar valores com chaves iguais.
		Map<Integer, String> usuarios = new HashMap<>();
		
		// Para adcionar um elemento do conjunto de tipo "map", usa-se
		// o comando ".put" ao invés do ".add". Esse comando também serve para
		// editar um elemento já existente. 
		usuarios.put(1, "Pedro Alonso");
		System.out.println(usuarios.get(1)); // Pega o valor do elemento que tem como chave o número 1
		usuarios.put(1, "Jean");
		System.out.println(usuarios.get(1));
		
		usuarios.put(2, "Barry Allen");
		usuarios.put(3, "Rafael Oscar");
		usuarios.put(4, "Aristovo");
		
		System.out.println("----------------------------------------------------------");
		
		// O comando ".keySet" retorna todas as chaves registradas no conjunto.
		System.out.println(usuarios.keySet());
		// O comando ".values" retorna todos os valores registrados no conjunto.
		System.out.println(usuarios.values());
		// O comando ".entrySet" retorna todas as chaves e seus respectivos valores registrados no conjunto.
		System.out.println(usuarios.entrySet());
		
		System.out.println("----------------------------------------------------------");
		
		// O comando ".containsKey" verifica se a chave informada existe dentro do conjunto.
		// A mesma coisa acontece com o comando ".containsValue".
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Aristovo"));
		System.out.println(usuarios.containsKey(40));
		System.out.println(usuarios.containsValue("Adalberto"));
		
		System.out.println("----------------------------------------------------------");
		
		// Usando o comando ".remove", pode-se remover um elemento tanto usando apenas a
		// sua chave, quanto usando a sua chave e o seu valor respectivo.
		System.out.println(usuarios.remove(2) != null ? true : false); // Lógica para o "remove" retornar um valor booleano
		usuarios.put(2, "Barry Allen");
		System.out.println(usuarios.remove(2, "Olavo"));
		
		System.out.println("----------------------------------------------------------");
		
		// É possível percorrer um conjunto do tipo "map" de 3 formas:
		
		// Usando só a chave dos elementos.
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("");
		
		// Usando śo o valor dos elementos.
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("");
		
		// Usando o elemento inteiro a paritr do "Entry<K, V>" (especificamente o "Entry" do
		// java.util.Map).
		for(Entry<Integer, String> elemento: usuarios.entrySet()) {
			System.out.println(elemento.getKey() + " - " + elemento.getValue() + " -> " + elemento);
		}
		
	}
}
