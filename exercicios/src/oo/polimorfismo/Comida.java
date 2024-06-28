package oo.polimorfismo;

public class Comida {

	// Ao criar a classe "Comida" consigo reutilizar todo o código relacionado ao peso
	// de qualquer comida (incluindo o método "comer" da classe "Pesssoa"). Isso é um exemplo
	// de polimorfismo dinâmico.
	private double peso;

	protected Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
