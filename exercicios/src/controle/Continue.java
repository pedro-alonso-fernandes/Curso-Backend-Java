package controle;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				// O "continue" faz com que o java pule a repetição atual e vá para
				// a próxima. Nesse caso, quando i = 3 o java passará direto para o 
				// próxima caso (i = 4), assim não digitará o número "3" no console.
				continue;
			}
			System.out.println("i = " + i);
		}
		
	}
	
}
