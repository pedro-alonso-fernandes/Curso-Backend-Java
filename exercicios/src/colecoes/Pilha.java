package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		// O conjunto do tipo "Stack" é uma pilha, em que o primeiro elemento a entrar é
		// o último a sair (Firs In Last Out).
		
		Deque<String> livros = new ArrayDeque<>();

		// O comando ".push" também adiciona elementos à pilha. A diferença é que os elementos 
		// adicionados pelos "add" vão sair na ordem natural de entrada (o que não faz sentido em uma pilha),
		// enquanto os elementos adicionados pelo "push" vão sair na ordem de uma pilha (First In
		// Last Out). Além disso, o "add" retorna valores booleanos ("true" ou "false") enquanto o
		// "push" não retorna nada.
		livros.push("Arsene Lupin, o ladrão de casaca");
		livros.add("O Pequeno Príncipe");
		livros.push("Sherlock Holmes");
		livros.add("Código DaVinci");

		for (String livro : livros) {
			System.out.println(livro);
		}

		// O conjunto do tipo "stack" possui comandos semelhates ao tipo "queue", como:
		// ".peek"; ".element"; ".poll"; ".remove"; etc.
		
		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println("------------------------------");
		
		// O comando ".pop" faz a mesma coisa que o ".remove": retorna o próximo elemento
		// da pilha e remove esse elemento. Ele também retorna um exceção se a pilha estiver vazia.
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.poll());

	}
}
