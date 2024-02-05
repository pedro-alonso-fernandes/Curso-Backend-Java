package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double a = Math.pow(6*(3+2), 2);
		//System.out.println(a);
		
		double b = 3*2;
		//System.out.println(b);
		
		double c = (1 - 5) * (2 - 7);
		//System.out.println(c);
		
		double d = 2;
		
		double ab = a/b;
		//System.out.println(ab);
		
		double cd = Math.pow(c/d, 2);
		//System.out.println(cd);
		
		double numerador = Math.pow(ab - cd, 3);
		//System.out.println(numerador);
		
		double denominador = Math.pow(10, 3);
		//System.out.println(denominador);
		
		double resultado = numerador/denominador;
		System.out.printf("O resultado da equação é de %.2f", resultado);
	}
	
}
