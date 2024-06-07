package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	// Relação bidirecional onde a instância de "Carro" tem acesso a "Motor" assim
	// como a instância de "Motor" tem acesso a "Carro".
	final Carro carro;
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if(ligado) {
			return (int) Math.round(fatorInjecao * 3000);
		} else {
			return 0;
		}
	}
	
}
