package controle;

public class BreakRotulado {

	public static void main(String[] args) {

		// "externo" é um rótulo que, no caso, nomea o primeiro "for".
		// Pode-se escolher o nome que quiser (assim como uma variável).
		// Com o "for" nomeado, é possível quebrar sua repetição de qualquer parte
		// do código, utilizando o "break":
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}

		System.out.println("Fim!");

	}

}
