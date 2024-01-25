package fundamentos;

//importação da extensão de formatar númmeros reais.
import java.text.DecimalFormat; 

public class Temperatura {

	public static void main(TipoString[] args) {
		
		double tempFahrenheit = 86;
		final int FATOR1 = 32;
		final double FATOR2 = 5.0/9.0;
		double tempCelsius = (tempFahrenheit - FATOR1) * FATOR2;
		
		// Extensão para formatar números decimais (eu usei para mostrar apenas as 2 primeiras casas decimais
		// das temperaturas):
		DecimalFormat fmt = new DecimalFormat("0.0");
		 
						// Comando para formatar um número real:
		System.out.println(fmt.format(tempFahrenheit) + "°F é equivalente a " + fmt.format(tempCelsius) + "°C");
		
		
	}
}
