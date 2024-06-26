package oo.heranca;

public class Jogador {

	protected int vida = 100;
	protected int x;
	protected int y;
	
	// Como a classe atual é a classe pai de outras classes, se eu alterar
	// o construtor da classe atual também vou ter que alterar o construtor das
	// classes filhas (conforme necessário).
	protected Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {
		
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
	
	public boolean andar(Direcao direcao) {
		
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
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
