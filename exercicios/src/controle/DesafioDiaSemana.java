package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome de uma dia da semana: ");
		String nomeDia = entrada.next();
		int numDia;
		
		//System.out.println(nomeDia);
		
		if(nomeDia.equalsIgnoreCase("Domingo")) {
			numDia = 1;
			nomeDia = nomeDia.toLowerCase().replace("d", "D");
			
		} else if(nomeDia.equalsIgnoreCase("Segunda") || nomeDia.equalsIgnoreCase("Segunda-Feira")) {
			numDia = 2;
			nomeDia = nomeDia.toLowerCase().replace("s", "S").replace("f", "F");
			
			if(!nomeDia.toLowerCase().contains("feira")) {
				nomeDia = nomeDia + " Feira";
			}
			
		} else if(nomeDia.equalsIgnoreCase("Terça") || nomeDia.equalsIgnoreCase("Terça-Feira") || nomeDia.equalsIgnoreCase("Terca") || nomeDia.equalsIgnoreCase("Terca-Feira")) {
			numDia = 3;
			nomeDia = nomeDia.toLowerCase().replace("t", "T").replace("f", "F");
			
			if(!nomeDia.toLowerCase().contains("feira")) {
				nomeDia = nomeDia + " Feira";
			}
			
		} else if(nomeDia.equalsIgnoreCase("Quarta") || nomeDia.equalsIgnoreCase("Quarta-Feira")) {
			numDia = 4;
			nomeDia = nomeDia.toLowerCase().replace("q", "Q").replace("f", "F");
			
			if(!nomeDia.toLowerCase().contains("feira")) {
				nomeDia = nomeDia + " Feira";
			}
			
		} else if(nomeDia.equalsIgnoreCase("Quinta") || nomeDia.equalsIgnoreCase("Quinta-Feira")) {
			numDia = 5;
			nomeDia = nomeDia.toLowerCase().replace("q", "Q").replace("f", "F");
			
			if(!nomeDia.toLowerCase().contains("feira")) {
				nomeDia = nomeDia + " Feira";
			}
			
		} else if(nomeDia.equalsIgnoreCase("Sexta") || nomeDia.equalsIgnoreCase("Sexta-Feira")) {
			numDia = 6;
			nomeDia = nomeDia.toLowerCase().replace("s", "S").replace("f", "F");
			
			if(!nomeDia.toLowerCase().contains("feira")) {
				nomeDia = nomeDia + " Feira";
			}
			
		} else if(nomeDia.equalsIgnoreCase("Sábado") || nomeDia.equalsIgnoreCase("Sabado")) {
			numDia = 7;
			nomeDia = nomeDia.toLowerCase().replace("ab", "áb").replace("s", "S");
			
		} else {
			numDia = 0;
		}
		
		
		if(numDia > 0) {
			System.out.printf("%s é o %dº dia da semana.", nomeDia, numDia);
		} else {
			System.out.println("Você não digitou o nome de um dia da semana, ou digitou errado!!");
		}
		
		entrada.close();
		
	}
	
}
