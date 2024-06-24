package oo.heranca;

public class Monstro extends Jogador {

	// Ao criar uma classe com herança, o construtor da classe criada vai chamar
	// o construtor da classe pai. Portanto, se você alterar o construtor da classe
	// pai, terá que alterar o construtor da classe criada também (conforme necessário).
	Monstro() {
		// Nesse caso, o comando "this" chama o outro construtor dessa classe.
		this(0, 0);
	}
	
	Monstro(int x, int y){
		// Nesse caso, o comando "super" chama o construtor da classe pai.
		super(x, y);
	}
}
