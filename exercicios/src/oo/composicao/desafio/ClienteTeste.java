package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Carlos Jehovah");
		
		cliente.novaCompra();
		cliente.compras.get(0).adicionarItem("Sabão em pó", 15.90, 2);;
		cliente.compras.get(0).adicionarItem("Detergente", 5.50, 5);
		
		cliente.listarCompra();
		
	}
}
