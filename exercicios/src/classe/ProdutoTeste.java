package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4000, 0.25);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 13.75;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.01);
		double media = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média de preço do carrinho é R$%.2f.", media);
		
		
	}
	
}
