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
	
	void listarCompras() {
		
		System.out.println("----------------------------------------");
		System.out.println("Registro de compras do " + nome);
		System.out.println("----------------------------------------");
		System.out.println();
		for(int i = 0; i < compras.size(); i++) {
			System.out.println("---------------------------");
			System.out.println("Compra " + (i + 1));
			System.out.println("---------------------------");
			compras.get(i).listarItens();
			System.out.println();
			System.out.println();
			
		}
	}
	
	double valorTotalCompras() {
		double total = 0;
		
		for(int i = 0; i < compras.size(); i++) {
			for(int j = 0; j < compras.get(i).itens.size(); j++) {
				total += precoProduto(i, j) * qtdItens(i, j);
			}
		}
		
		return total;
	}
	
	double precoProduto(int i, int j) {
		return compras.get(i).itens.get(j).produto.preco;
	}
	
	int qtdItens(int i, int j) {
		return compras.get(i).itens.get(j).qtd;
	}
}
