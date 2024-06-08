package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		// Relação unidirecional
		Compra compra = new Compra();

		compra.cliente = "Cláudio";
		compra.itens.add(new Item("Copo", 6, 3));
		compra.itens.add(new Item("Mesa", 1, 500));
		compra.itens.add(new Item("Cadeira", 6, 50));

		// Relação bidirecional
		Compra compra2 = new Compra();

		compra2.cliente = "Lúcio";
		compra2.adicionarItem("Notebook", 1, 2500);
		compra2.adicionarItem("Mouse", 1, 240);
		compra2.adicionarItem("Headset", 1, 60);
		

		
		
		// Lista de compras 1
		System.out.println("Lista de Compras do " + compra.cliente);
		System.out.println("--------------------------------");
		for (Item item : compra.itens) {
			System.out.println("Item " + (compra.itens.indexOf(item) + 1));
			System.out.println("Nome: " + item.nome);
			System.out.println("Quantidade: " + item.qtd);
			System.out.printf("Preço: R$%.2f", item.preco);
			System.out.println("\n--------------------------------");
		}

		System.out.println("Total de itens da lista: " + compra.itens.size());
		System.out.printf("Valor total da compra: R$%.2f \n", compra.valorTotal());

		
		
		
		
		// Separação entre as listas de compras
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();

		
		
		
		
		// Lista de compras 2
		System.out.println("Lista de Compras do " + compra2.cliente);
		System.out.println("--------------------------------");
		for (Item item : compra2.itens) {
			System.out.println("Item " + (compra2.itens.indexOf(item) + 1));
			System.out.println("Nome: " + item.nome);
			System.out.println("Quantidade: " + item.qtd);
			System.out.printf("Preço: R$%.2f", item.preco);
			System.out.println("\n--------------------------------");
		}

		System.out.println("Total de itens da lista: " + compra2.itens.size());
		System.out.printf("Valor total da compra: R$%.2f \n", compra2.valorTotal());
		
		
		
		
		// Só pra mostrar a relação bidirecional!!!
		System.out.println("\n\n" + compra2.itens.get(0).compra.itens.get(1).compra.valorTotal());
	}
}
