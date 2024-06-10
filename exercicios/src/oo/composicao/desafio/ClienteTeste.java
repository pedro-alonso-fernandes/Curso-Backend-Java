package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Carlos Jehovah");
		
		cliente.novaCompra();
		cliente.compras.get(0).adicionarItem("Sabão em pó", 15.90, 2);
		cliente.compras.get(0).adicionarItem("Detergente", 5.50, 5);
		
		cliente.novaCompra();
		cliente.compras.get(1).adicionarItem("Violão", 375, 1);
		cliente.compras.get(1).adicionarItem("Jogo de corda de violão", 40, 1);
		
		cliente.listarCompras();
		
		for(int i = 0; i < cliente.compras.size(); i++) {
			System.out.printf("Valor Compra %d: R$%.2f \n", (i + 1), cliente.compras.get(i).valorCompra());
		}
		
		System.out.printf("Valor Total: R$%.2f \n", cliente.valorTotalCompras());
		
	}
}
