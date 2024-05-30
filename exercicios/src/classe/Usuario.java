package classe;

public class Usuario {

	String nome;
	String email;
	
	
	// Esse "equals" abaixo pertence a todas as instâncias dessa classe.
	public boolean equals(Object obj) {
		
		// O comando "instaceof" verifica se o objeto "obj" é uma instancia da classe "Usuario": 
		if(obj instanceof Usuario) {
			
			Usuario outro = (Usuario) obj; // Aqui converti o "obj" do tipo "Object" para o tipo "Usuario"
			
		// O "equals" abaixo pertence a todas as instâncias da classe "String", assim como
		// as instâncias "nome" e "email" criadas nas linhas 5 e 6.
			boolean nome = outro.nome.equals(this.nome);
			boolean email = outro.email.equals(this.email);
			
			return nome && email;
		} else {
			return false;
		}
		
	}
	
	// A parte do hascode será em outra aula!
	public int hashCode() {
		return 0;
	}
}
