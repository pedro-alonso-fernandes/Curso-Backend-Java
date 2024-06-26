package oo.heranca.teste;

import oo.heranca.desafio.Camaro;
import oo.heranca.desafio.HB20;

public class CarroTeste {

	public static void main(String[] args) {
		
		HB20 hb20 = new HB20();
		Camaro camaro = new Camaro(300);
		
		System.out.println("HB20: " + hb20.velocidadeAtual() + "km/h");
		System.out.println("Camaro: " + camaro.velocidadeAtual() + "km/h");
		
		hb20.frear();
		camaro.frear();
		
		System.out.println("------------------------");
		System.out.println("HB20: " + hb20.velocidadeAtual() + "km/h");
		System.out.println("Camaro: " + camaro.velocidadeAtual() + "km/h");
		
		hb20.acelerar();
		camaro.acelerar();
		
		System.out.println("------------------------");
		System.out.println("HB20: " + hb20.velocidadeAtual() + "km/h");
		System.out.println("Camaro: " + camaro.velocidadeAtual() + "km/h");
		
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.frear();
		
		hb20.acelerar();
		hb20.acelerar();
		hb20.frear();
		
		System.out.println("------------------------");
		System.out.println("HB20: " + hb20.velocidadeAtual() + "km/h");
		System.out.println("Camaro: " + camaro.velocidadeAtual() + "km/h");
		
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar();
		camaro.acelerar(); // Chega a 300km/h
		camaro.acelerar();
		
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar();
		hb20.acelerar(); // Chega a 160km/h
		hb20.acelerar();
		
		System.out.println("------------------------");
		System.out.println("HB20: " + hb20.velocidadeAtual() + "km/h");
		System.out.println("Camaro: " + camaro.velocidadeAtual() + "km/h");
	}
}
