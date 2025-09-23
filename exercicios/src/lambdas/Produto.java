package lambdas;

// Por padrão TODA classe tem um "extends Object" implícito, pois tem por classe mãe a "Object"
public class Produto extends Object{

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString(){
		double precoFinal = preco * (1 - desconto);
		String precoString = String.format("%.2f", precoFinal);
		return "Nome : " + nome + " | Preço: R$" + precoString;
	}
}
