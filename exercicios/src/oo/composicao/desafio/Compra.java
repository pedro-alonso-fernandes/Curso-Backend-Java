package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, double preco, int qtd) {
		
		Produto produto = new Produto();
		produto.nome = nome;
		produto.preco = preco;
		
		Item item = new Item();
		item.produto = produto;
		item.qtd = qtd;
		
		itens.add(item);
		
	}
	
	public String toString() {
		return itens.toString();
	}
	
}
