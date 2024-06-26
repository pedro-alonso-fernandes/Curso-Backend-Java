package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testarAcesso() {
		Ana mae = new Ana();
		
		// Acessando os atributos através de instância de "Ana":
		
//		System.out.println(mae.segredo);
//		System.out.println(mae.dentroDeCasa);
//		System.out.println(mae.formaDeFalar);
		System.out.println(mae.geralSabe);
		
		// Acessando os atributos através de herança:
		
//		System.out.println(segredo);
//		System.out.println(dentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(geralSabe);
		
		// Por ter herdado de "Ana", "Pedro" consegue acessar o atributo public(geralSabe);
		// e o atributo protected(foramDeFalar). Porém, só é possível acessar o atributo protected
		// através da sua herança, ou seja, caso tente acessar através de uma instância de "Ana" não
		// vai funcionar
		
	}
}
