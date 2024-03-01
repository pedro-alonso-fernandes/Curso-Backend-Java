package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		                    
		System.out.println("Comprou a TV de 50 polegadas: " + (trabalho1 && trabalho2));
		System.out.println("Comprou a TV de 32 polegadas: " + (trabalho1 ^ trabalho2));
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Tomou sorvete: " + sorvete);
		System.out.println("Dessa forma, foi mais saudável: " + !sorvete);
		
	}
	
}
