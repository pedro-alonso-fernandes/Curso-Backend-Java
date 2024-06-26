package oo.heranca.desafio;

public class Camaro extends Carro {

	public Camaro(){
		this(250);
	}
	
	public Camaro(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
		// O "@Override" mostra ao eclipse que você está sobreescrevendo um
		// método já existente na classe pai.
//		@Override
//		void acelerar() {
//			if((velocidadeAtual + 15) > VELOCIDADE_MAXIMA) {
//				velocidadeAtual = VELOCIDADE_MAXIMA;
//			}
//			
//		}
	
}
