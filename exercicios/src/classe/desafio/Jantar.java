package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.nome = "José";
		p.peso = 85.0;
		
		
		Comida c1 = new Comida();
		
		Comida c2 = new Comida();
		c2.nome = "feijão";
		c2.peso = 0.200;
		
		Comida c3 = new Comida("carne", 0.5);
		
		System.out.println("------" + p.nome + "------");
		System.out.println(("Peso antes: " + p.peso + " Kgs").replace(".", ","));
		
		System.out.println(p.comer(c1));
		
		System.out.println(p.comer(c2));
		
		System.out.println(p.comer(c3));
		
		System.out.println(("Peso final: " + p.peso + " Kgs").replace(".", ","));
		
	}
	
}
