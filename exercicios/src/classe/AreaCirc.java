package classe;

public class AreaCirc {

	// O "static" significa que a constante pertence à classe, e não
	// à uma instância de objeto. Assim, para usar essa constante deve-se chamá-la
	// com o nome da classe ao invés de instanciar um objeto para isso.
	// Veja isso no arquivo "AreaCircTeste".
	static final double PI = 3.1415;
	double raio;
	
	AreaCirc(double Raio){
		raio = Raio;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	// A mesma coisa descrita nas linhas 5 a 8, acontece com um método que tem o "static".
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
