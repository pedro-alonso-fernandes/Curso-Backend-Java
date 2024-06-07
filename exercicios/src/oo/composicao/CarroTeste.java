package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		
		System.out.println(c1.estaLigado());
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Rotação máxima do motor: " + c1.motor.giros() + "rpm");
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println("Rotação mínima do motor: " + c1.motor.giros() + "rpm");
		
		System.out.println("----------------------------------------");
		
		// Faltou o "encapsulamento", pois nesse caso, não é bom permitir que o usuário mude
		// o valor da variável "fatorInjecao" diretamente por uma instância de "Carro".
		c1.motor.fatorInjecao = -30;
		System.out.println(c1.motor.giros());
		c1.motor.fatorInjecao = 1;
		
		// Representação a relação bidirecional entre "Carro" e "Motor":
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
	}
}
