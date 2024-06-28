package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
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
	
	// Logo abaixo tem-se um exemplo de polimorfismo estático, onde estão escritos métodos com mesmo
	// nome e tipo, mas por receberem parâmetros diferentes, tem funcionalidades diferentes. Assim é 
	// possível reaproveitar código no momento de utilização desses métodos.
	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}
}
