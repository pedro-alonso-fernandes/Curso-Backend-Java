package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		// O comando "charAt" retorna o carctere que está no index informado:
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		// O comando "startsWith" verifica se uma string começa do jeito informado:
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		// O comando "endsWith" verifica se a string termina do jeito informado:
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		
		System.out.println(s.length());
		
		System.out.println(s.toLowerCase().equals("boa tarde"));
		// O comando "equalsIgnoreCase" verifica se uma string é igual a outra string, ignorando
		// a diferença entre maiúsculas e minúsculas
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		// Para mostrar apenas duas casas decimais no "printf", basta referenciar a variável como "%.2f":
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		// O comando "String.format" salva uma string de acordo com a formatação do "printf":
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		
		// O comando "indexOf" retorna qual o index da letra ou palavra informada:
		System.out.println("Frase qualquer".indexOf("qual"));
		
		// O comando "substring" retorna uma string, que começa do index informado até o final de uma string: 
		System.out.println("Frase qualquer".substring(6));
		// No caso a seguir, o comando retornará uma string que começa no index 6 e termina antes do index 10
		// da string informada:
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
