package oo.composicao;

public class Item {

	String nome;
	int qtd;
	double preco;
	Compra compra; // Relação bidirecional
	
	Item(String nome, int qtd, double preco){
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}
}
