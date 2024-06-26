package oo.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused")

	// Existem 4 tipos de encapsulamento: private, package(default), protected,
	// e public.
	
	// Usando o "private", apenas a classe que possui o atributo/método pode acessá-lo.
	private String segredo = "segredo";
	
	// Se não for colocado nada, será utilizado o "package". Com o "package", as classes que poderão 
	// acessar o atributo/método são: a classe que possui o atributo/método; as classes do mesmo pacote.
	String dentroDeCasa = "dentro de casa";
	
	// Usando o "protected", as classes que poderão acessar o atributo/método são: a classe que possui
	// o atributo/método; as classes do mesmo pacote; as classes que herdam dela.
	protected String formaDeFalar = "forma de falar";
	
	// Usando o "public", todas as classes do sistema podem acessar o atributo/método.
	public String geralSabe = "geral sabe";
}
