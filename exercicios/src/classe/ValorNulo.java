package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		// O valor "null" significa que o objeto não tem endereço
		// de memória registrado. Assim, se tentar adicionar algo a esse objeto,
		// dará erro no momento de executar o código.
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.dia = 3;
			System.out.println(d1.dataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("????"));			
		}
		
	}
	
}
