package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4000);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 13.75;
		
		Produto.desconto = 0.50;
		
		String conta1 = String.format("%s => %.2f * %.2f = %.2f", p1.nome, p1.preco, 1 - Produto.desconto, p1.precoComDesconto());
		String conta2 = String.format("%s => %.2f * %.2f = %.2f\n", p2.nome, p2.preco, 1 - Produto.desconto, p2.precoComDesconto());
		System.out.println(conta1);
		System.out.println(conta2);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double media = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média de preço do carrinho é R$%.2f.", media);
		
		
	}
	
}
