package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Data data = new Data();
		
		System.out.print("Dia: ");
		data.dia = entrada.nextInt();
		
		System.out.print("Nome do mês: ");
		data.mes = entrada.next();
		
		System.out.print("Ano: ");
		data.ano = entrada.nextInt();
		
		if(data.mes.equalsIgnoreCase("janeiro")) {
			data.mes = "01";
		} else if(data.mes.equalsIgnoreCase("fevereiro")){
			data.mes = "02";
		} else if(data.mes.equalsIgnoreCase("março") || data.mes.equalsIgnoreCase("marco")){
			data.mes = "03";
		} else if(data.mes.equalsIgnoreCase("abril")){
			data.mes = "04";
		} else if(data.mes.equalsIgnoreCase("maio")){
			data.mes = "05";
		} else if(data.mes.equalsIgnoreCase("junho")){
			data.mes = "06";
		} else if(data.mes.equalsIgnoreCase("julho")){
			data.mes = "07";
		} else if(data.mes.equalsIgnoreCase("agosto")){
			data.mes = "08";
		} else if(data.mes.equalsIgnoreCase("setembro")){
			data.mes = "09";
		} else if(data.mes.equalsIgnoreCase("outubro")){
			data.mes = "10";
		} else if(data.mes.equalsIgnoreCase("novembro")){
			data.mes = "11";
		} else if(data.mes.equalsIgnoreCase("dezembro")){
			data.mes = "12";
		} else {
			data.mes = "erro";
		}
		
		switch (data.mes) {
		case "erro":
			System.out.println("O mês informado é inválido");
			break;
		default: 
			System.out.printf("A data informada é: %d/%s/%d", data.dia, data.mes, data.ano);
			break;
		}
		
		entrada.close();
		
	}
	
}
