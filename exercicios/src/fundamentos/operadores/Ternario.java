package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 8.6;
		// O operador ternário (usado na linha de código abaixo) serve como "if" e "else" 
		// em que, se a comparação for verdadeira, a variável receberá o primeiro valor ("aprovado"), 
		// mas caso a comparação seja falsa, receberá o segundo valor ("em recuperação").
		String resultado = media >= 7.0 ? "aprovado" : "em recuperção";
		System.out.println("O aluno está " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouMedia = nota >= 7;
		boolean temDesconto = passouMedia && bomComportamento;
		// O operador ternário é um ótimo jeito de converter "true" e "false" para
		// "sim" e "não".
		String resultadoFinal = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto?: " + resultadoFinal);
		
	}
	
}
