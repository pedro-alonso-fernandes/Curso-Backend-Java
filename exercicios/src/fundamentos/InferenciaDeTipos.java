package fundamentos;

public class InferenciaDeTipos {

	public static void main(TipoString[] args) {
		
		// É possível declarar variáveis sem especificar o tipos delas usando o "var".
		
		var inteiro = 5;
		System.out.println(inteiro);
		
		var real = 5.76;
		System.out.println(real);
		
		var string = "Funciona!";
		System.out.println(string);
		
		// Obs: para usar esse recurso, é preciso dar um valor para a variável na mesma linha que ela
		// foi criada, ou seja, é preciso inicializar a variável.
	}
}
