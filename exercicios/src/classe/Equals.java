package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Alonso";
		u1.email = "pedroalonso@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Alonso";
		u2.email = "pedroalonso@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u1.equals(new Date()));
	}
}
