package lambdas;

// Uma interface funcional é uma interface que possui apenas um método.
@FunctionalInterface 

// Obs: As anotações servem para adicionar validações no código. Ex:
// Se eu adicionar mais um método nessa interface, vai dar erro já que
// ela tem a anotação de uma interface funcional.
public interface Calculo {
	
	double executar(double a, double b);
}
