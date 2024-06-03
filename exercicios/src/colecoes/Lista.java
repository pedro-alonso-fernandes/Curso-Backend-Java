package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		// No conjunto do tipo "List", os elementos mantém a ordem de entrada,
		// além de serem indexados, ou seja, cada um possuí um index.
		
		List<Usuario> lista = new ArrayList<>(); // Sintaxe para se declarar um conjunto do tipo "List"
		
		Usuario u1 = new Usuario("Kauã");
		lista.add(u1);
		lista.add(new Usuario("Junim"));
		lista.add(new Usuario("Pedro Henrique"));
		lista.add(new Usuario("Igor"));
		
		
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println("---------------");
		
		lista.remove(1);
		// Com o "equals" e o "hashcode" definidos na classe "Usuario", é possível identificar um item da
		// lista (usuário) através do valor da sua variável (nome):
		lista.remove(new Usuario("Igor"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
