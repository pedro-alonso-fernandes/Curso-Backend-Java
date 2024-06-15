package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Herói - vida: " + monstro.vida);
		System.out.println("Monstro -  vida: " + heroi.vida);
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Herói - vida: " + monstro.vida);
		System.out.println("Monstro - vida: " + heroi.vida);
	}
}
