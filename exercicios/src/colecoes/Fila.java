package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// O conjunto do tipo "queue" é uma fila, em que o primeiro elemento a entrar é
		// o primeiro a sair (First In First Out).
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Bento");
		// O comando ".offer" também adiciona um elemento à fila. A diferença dele
		// para o ".add" é que: quando a fila está cheia e se tenta adicionar um elemento,
		// o "offer" vai retornar "false", enquanto com o "add" vai dar um erro.
		fila.offer("Tortuguita");
		fila.add("Red Beira Mar");
		fila.offer("Ismael");
		fila.offer("Igor Jorge Ferraz");
		
		// Tanto o comando ".peek" quanto o ".element" pegam o primeiro elemento da 
		// fila (sem removê-lo). A diferença entre eles é que: quando uma fila está 
		// vazia, o "peek" vai retornar "null", enquanto com o "element" vai dar um erro.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println("-----------------");
		
		// Tanto o comando ".poll" quanto o ".remove" pegam o primeiro elemento da 
		// fila e o removem. A diferença entre eles é que: quando uma fila está 
		// vazia, o "poll" vai retornar "null", enquanto com o "remove" vai dar um erro.
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		// Obs: também vale ressaltar que o conjunto do tipo "queue" tem alguns outros comandos
		// úteis, como o ".isEmpty" para verificar se a fila está vazia, ou o ".clear" para limpar
		// a fila.
		
	}
}
