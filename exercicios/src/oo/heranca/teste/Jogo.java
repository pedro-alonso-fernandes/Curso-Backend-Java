package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.setX(10);
		monstro.setY(10);
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("Herói - vida: " + monstro.getVida());
		System.out.println("Monstro -  vida: " + heroi.getVida());
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Herói - vida: " + monstro.getVida());
		System.out.println("Monstro - vida: " + heroi.getVida());
	}
}
