package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro Alonso", "Fernandes", -18);
		p1.setIdade(230); // Usando o método "setter"
		System.out.println(p1.getIdade()); // Usando o método "getter"
		System.out.println(p1);
		System.out.println("\nNome Completo: " + p1.getNomeCompleto());
	}
}
