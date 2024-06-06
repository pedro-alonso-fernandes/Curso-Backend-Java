package colecoes;

import java.util.HashSet;
import java.util.Set;

public class Hash {

	public static void main(String[] args) {
		
		Set<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Vinícius"));
		usuarios.add(new Usuario("Márcio"));
		usuarios.add(new Usuario("Eliana"));
		usuarios.add(new Usuario("Pedro Alonso"));
		
		// Se a classe "Usuario" tivesse somente o metodo "equals" (sem o metodo "hashcode")
		// não seria possível fazer comparações entre os elemento de um objeto ("usuarios" no caso).
		// 
		// Isso acontece pois, em uma comparação entre objetos, primeiro o java procura elementos
		// com o mesmo hascode do elemento desejado, e só depois se usa o metodo "equals" em cada um
		// dos elementos resultantes.
		System.out.println(usuarios.contains(new Usuario("Eliana")));
		System.out.println(usuarios.contains(new Usuario("Elian")));
		
	}
}
