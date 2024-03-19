package classe;

//import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		/*Scanner entrada = new Scanner(System.in);
		Data d1 = new Data();
		
		System.out.print("Dia: ");
		d1.dia = entrada.nextInt();
		
		System.out.print("Mês: ");
		d1.mes = entrada.next();
		
		System.out.print("Ano: ");
		d1.ano = entrada.nextInt(); */
		
		Data d1 = new Data(07, "novembro", 2024);
		
		String dataFinal = d1.dataFormatada();
		
		System.out.println("A data informada é: " + dataFinal);
		
		Data d2 = new Data();
		
		System.out.println(d2.dataFormatada());
		
		//entrada.close();
		
	}
	
}
