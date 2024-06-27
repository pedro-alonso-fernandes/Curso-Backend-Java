package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// Métodos Getters:
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Métodos Setters:
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public boolean setIdade(int idade) {
		idade = Math.abs(idade); // Deixa o número em módulo
		if(idade >= 0 && idade <= 120) {
			this.idade = idade;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nIdade: " + getIdade();
	} 
}
