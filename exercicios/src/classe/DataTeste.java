package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Data data = new Data();
		
		System.out.print("Dia: ");
		data.dia = entrada.nextInt();
		
		System.out.print("Mês: ");
		data.mes = entrada.next();
		
		System.out.print("Ano: ");
		data.ano = entrada.nextInt();
		
		String dataFinal = data.dataFormatada();
		
		System.out.println("A data informada é: " + dataFinal);
		
		data.imprimirDataFormatada();
		
		entrada.close();
		
	}
	
}
