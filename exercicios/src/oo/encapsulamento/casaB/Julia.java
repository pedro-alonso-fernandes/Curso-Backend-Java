package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testarAcesso() {
		Ana sogra = new Ana();
		
//		System.out.println(sogra.segredo);
//		System.out.println(sogra.dentroDeCasa);
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.geralSabe);
		
		// Por não ter nenhuma relação com "Ana", "Julia" só pode acessar o atributo public(geralSabe).
	}
}
