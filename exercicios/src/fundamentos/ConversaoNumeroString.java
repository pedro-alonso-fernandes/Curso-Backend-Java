package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		// Para converter um numero para string, é necessário utlizar o seu respectivo Wrapper
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}
	
}
