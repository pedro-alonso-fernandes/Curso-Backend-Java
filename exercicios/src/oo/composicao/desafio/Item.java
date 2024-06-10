package oo.composicao.desafio;

public class Item {

	Produto produto;
	int qtd;
	
	public String toString() {
		return "Produto: " + produto.nome + "\nPreço: " + produto.preco + "\nQuantidade: " + qtd;
	}
}
