package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// O conjunto do tipo "Set" não tem nenhuma forma de organização de seus elementos,
		// nem mesmo a ordem de entrada dos elementos é mantida.
		
		// Para fazer com que um conjunto aceite apenas um tipo de valor, deve-se
		// colocar o tipo desejado entre os sinais de maior e menor que(generics):
		Set<String> lista = new HashSet<>();
		lista.add("Pedro");
		lista.add("Gustavo");
		lista.add("Thalles");
		lista.add("Vallix");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		// O "SortedSet" também é um conjunto do tipo "set", porém ele ordena os valores do conjunto:
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(4);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
