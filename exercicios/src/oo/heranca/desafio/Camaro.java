package oo.heranca.desafio;

public class Camaro extends Carro {

	// O "@Override" mostra ao eclipse que você está sobreescrevendo um
	// método já existente na classe pai.
	@Override
	void acelerar() {
		for(int i = 0; i < 3; i++) {
			super.acelerar();
		}
	}
	
}
