package controle;

public class Break {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				// O "break" faz com que o java saia do laço de repetição atual e 
				// continue executando o resto do código.
				break;
			}
			System.out.println("i = " + i);
		}
		System.out.println("Fim!");
		
	}
	
}
