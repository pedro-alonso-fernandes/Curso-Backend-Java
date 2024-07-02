package oo.heranca.desafio;

// "extends" é usado para herdar de uma classe, e "implements" é para implementar
// uma interface
public class Camaro extends Carro implements Esportivo, Luxo{

	private boolean turbo = false;
	private boolean ar = false;
	
	public Camaro(){
		this(250);
	}
	
	public Camaro(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	// O "@Override" mostra ao eclipse que você está sobreescrevendo um
	// método já existente na classe pai.
	@Override
	public void ligarTurbo() {
		turbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		turbo = false;
	}
	
	@Override
	public void ligarAr() {
		ar = true;
	}
	
	@Override
	public void desligarAr() {
		ar = false;
	}
	
	@Override
	public int getDelta() {
		if(turbo && !ar) {
			return 35;
		}
		else if(turbo && ar) {
			return 30;
		}
		else if(!turbo && !ar) {
			return 20;
		}
		else {
			return 15;
		}
	}
	
}
