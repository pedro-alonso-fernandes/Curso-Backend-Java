package oo.encapsulamento.casaA;

public class Paulo {

	void testarAcesso() {
		Ana esposa = new Ana();
		
//		System.out.println(esposa.segredo);
		System.out.println(esposa.dentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.geralSabe);
		
		// Por estar no mesmo pacote de "Ana", "Paulo" consegue acessar o atributo public(geralSabe);
		// o atributo protected(foramDeFalar); e o atributo package(dentroDeCasa).
	}
}
