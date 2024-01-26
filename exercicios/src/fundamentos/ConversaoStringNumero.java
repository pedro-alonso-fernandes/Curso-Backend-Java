package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		// O comando "JOptionPane.showInputDialog()" abre uma janela com uma caixa para inserir valores (input),
		// além do botão de confirmar e do botão de cancelar. Nesse comando, o texto digitado dentro dos parênteses
		// (com aspas duplas) aparecerá para o usuário como um enunciado:
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		
		// Para se converter uma string para número, deve se utilizar o "parse" assim como mostrado a seguir:
		float num1 = Float.parseFloat(valor1);
		float num2 = Float.parseFloat(valor2);
		float soma = num1 + num2;
		
		System.out.println("O resultado da soma é: " + soma);
		
	}
	
}
