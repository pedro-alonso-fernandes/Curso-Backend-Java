package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		//a1.PI = 1000;
		
		//AreaCirc a2 = new AreaCirc(5);
		
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.area(100));
		
		// Chama-se a constante "PI" pelo nome da classe, já que ela pertence
		// à classe (static).
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}
	
}
