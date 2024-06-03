package colecoes;

import java.util.Objects;

public class Usuario {

	String nome;
	
	Usuario(String nome){
		this.nome = nome;
	}

	// Métodos gerados pelo próprio Eclipse. Com eles devidamente declarados, pode-se
	// comparar objetos da forma correta.
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
