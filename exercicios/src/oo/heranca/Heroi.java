package oo.heranca;

public class Heroi extends Jogador {

	// Ao criar uma classe com herança, o construtor da classe criada vai chamar
	// o construtor da classe pai. Portanto, se você alterar o construtor da classe
	// pai, terá que alterar o construtor da classe criada também (conforme necessário).
	public Heroi(int x, int y){
		// Nesse caso, o comando "super" chama o construtor da classe pai.
		super(x, y);
	}
	
	
	// Reescrevi o método "atacar" do Herói para que ele tenha um ataque mais
	// forte do que o Monstro (no caso, o ataque do herói é 3x mais forte):
	public boolean atacar(Jogador oponente) {
		// O comando "super" se refere a classe pai da classe atual. No caso, 
		// ele está se referindo a classe "Jogador".
		boolean atq1 = super.atacar(oponente);
		boolean atq2 = super.atacar(oponente);
		boolean atq3 = super.atacar(oponente);
		
		return atq1 || atq2 || atq3;
	}
}
