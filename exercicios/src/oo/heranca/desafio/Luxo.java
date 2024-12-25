package oo.heranca.desafio;

public interface Luxo {

	// Uma interface serve para ser implementada à uma classe. Ao implementar uma
	// interface à uma classe, a classe é obrigada a ter todos os metódos que estão
	// contidos na interface.

	// Mesmo não especificando nada, os métodos definidos na interface são "public"
	// e "abstract" por padrão.
	void ligarAr();
	void desligarAr();
	
	// É possível definir um método com um valor padrão dentro de uma interface. Assim, a classe
	// em que essa interface for implementada, não será obrigada a definir esse método, podendo utilizar
	// o valor padrão.
	default int velocidadeDoAr() {
		return 1;
	}
}
