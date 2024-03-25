package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	String comer(Comida c) {
		peso += c.peso;
		return ("Comeu " + c.nome + ": " + peso + " Kgs").replace(".", ",");
	}
	
	Pessoa(){
		nome = "José";
		peso = 80;
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
}
