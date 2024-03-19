package classe;

public class Data {

	int dia;
	String mes;
	int ano;
	
	Data(int Dia, String Mes, int Ano){
		dia = Dia;
		mes = Mes;
		ano = Ano;
	}
	
	Data(){
		dia = 1;
		mes = "01";
		ano = 1970;
	}
	
	String dataFormatada() {
		String data = "";
		
		if(mes.equalsIgnoreCase("janeiro")) {
			mes = "01";
		} else if(mes.equalsIgnoreCase("fevereiro")){
			mes = "02";
		} else if(mes.equalsIgnoreCase("março") || mes.equalsIgnoreCase("marco")){
			mes = "03";
		} else if(mes.equalsIgnoreCase("abril")){
			mes = "04";
		} else if(mes.equalsIgnoreCase("maio")){
			mes = "05";
		} else if(mes.equalsIgnoreCase("junho")){
			mes = "06";
		} else if(mes.equalsIgnoreCase("julho")){
			mes = "07";
		} else if(mes.equalsIgnoreCase("agosto")){
			mes = "08";
		} else if(mes.equalsIgnoreCase("setembro")){
			mes = "09";
		} else if(mes.equalsIgnoreCase("outubro")){
			mes = "10";
		} else if(mes.equalsIgnoreCase("novembro")){
			mes = "11";
		} else if(mes.equalsIgnoreCase("dezembro")){
			mes = "12";
		} else if(mes.equals("01") || mes.equals("02") || mes.equals("03") || mes.equals("04") || mes.equals("05") || mes.equals("06") || mes.equals("07") || mes.equals("08") || mes.equals("09") || mes.equals("10") || mes.equals("11") || mes.equals("12")) {
			
		} else if(mes.equals("1") || mes.equals("2") || mes.equals("3") || mes.equals("4") || mes.equals("5") || mes.equals("6") || mes.equals("7") || mes.equals("8") || mes.equals("9")) {
			mes = "0" + mes;
		} else {
			mes = "erro";
		}
		
		switch (mes) {
		case "erro":
			data = "\nErro! mês inválido!";
			break;
		default:
			// A função "format" da "String", retorna uma String formatada de acordo
			// com as características do "printf":
			data = String.format("%d/%s/%d", dia, mes, ano);
			break;
		}
		
		return data;
	}
	
	void imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
	
}
