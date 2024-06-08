package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	double valorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.preco * item.qtd;
		}
		return total;
	}
	
	// Relação bidirecional
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adicionarItem(String nome, int qtd, double preco) {
		adicionarItem(new Item(nome, qtd, preco));
	}
	
}
