package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;
	
	// Como a classe atual é a classe pai de outras classes, se eu alterar
	// o construtor da classe atual também vou ter que alterar o construtor das
	// classes filhas (conforme necessário).
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(Jogador oponente) {
		
		// O método "Math.abs()" deixa um número em módulo, ou seja, ele sempre
		// retornará um número positivo.
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}
		else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	boolean andar(Direcao direcao) {
		
		switch(direcao) {
		case NORTE:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y--;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
