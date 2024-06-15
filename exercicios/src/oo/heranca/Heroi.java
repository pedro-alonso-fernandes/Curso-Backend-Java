package oo.heranca;

public class Heroi extends Jogador {

	// Reescrevi o método "atacar" do Herói para que ele tenha um ataque mais
	// forte do que o Monstro (no caso, o ataque do herói é 3x mais forte):
	boolean atacar(Jogador oponente) {
		// O comando "super" se refere a classe pai da classe atual. No caso, 
		// ele está se referindo a classe "Jogador".
		boolean atq1 = super.atacar(oponente);
		boolean atq2 = super.atacar(oponente);
		boolean atq3 = super.atacar(oponente);
		
		return atq1 || atq2 || atq3;
	}
}
