package oo.abstrato;

public class Cachorro extends Mamifero{

	// Como o método abstrato "mover" já foi definido na classe "Mamifero", não é necessário alterar ele aqui.
	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
	
}
