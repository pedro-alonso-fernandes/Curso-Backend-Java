package fundamentos;

public class AreaCircunferencia {

	public static void main(TipoString[] args) {
		double raio = 3.4;
		// O comando "final" determina que "PI" é uma constante, por isso não pode ter o seu valor mudado
		// Costumava colocar o nome das constantes em letras maiúsculas, assim como está o nome da constante "PI"
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m².");
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Área = " + area + "m².");
	}
}
