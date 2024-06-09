package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	void novaCompra() {
		Compra compra = new Compra();
		compras.add(compra);
	}
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void listarCompra() {
		System.out.println("Compra 1");
		System.out.println("---------------------------");
		for(Item item: compras.get(0).itens) {
			System.out.println(item);
		}
	}
}
