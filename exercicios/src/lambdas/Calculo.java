package lambdas;

// Uma interface funcional é uma interface que possui apenas um método (Exceto métodos default e static).
@FunctionalInterface 

// Obs: As anotações servem para adicionar validações no código. Ex:
// Se eu adicionar mais um método nessa interface, vai dar erro já que
// ela tem a anotação de uma interface funcional.
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
