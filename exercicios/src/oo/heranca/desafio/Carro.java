package oo.heranca.desafio;

public class Carro {

	protected int velocidadeAtual = 0;
	public final int VELOCIDADE_MAXIMA;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if((velocidadeAtual + delta) > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		else{
			velocidadeAtual += delta;
		}
	}
	
	public void frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 5;
		}
	}
	
	public int velocidadeAtual() {
		return this.velocidadeAtual;
	}
	
}
