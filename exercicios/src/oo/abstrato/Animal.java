package oo.abstrato;

// Uma classe abstrata não pode ser instanciada. O intuito dela é ser a classe pai de outra classe, ou seja,
// é ser herdada por outra classe.
public abstract class Animal {
	
	public String respirar() {
		return "Usando Oxigênio";
	}
	
	// Em uma classe abstrata pode-se criar um método abstrato também, método esse que deverá ser devidamente
	// definido na classe final.
	public abstract String mover();

}
