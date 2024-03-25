package classe;

public class PrimeiroTrauma {

	int a = 3;
	
	public static void main(String[] args) {
		
		// Não é possível acessar um código que pertence a instância (sem "static")
		// dentro de um código que pertence a classe (static). Por isso tive que instanciar
		// um objeto para poder manipulá-lo:
		PrimeiroTrauma sera = new PrimeiroTrauma();
		System.out.println(sera.a);
		
	}
	
}
