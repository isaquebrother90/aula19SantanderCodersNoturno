package exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExcecaoUm {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Pato");
		lista.add("Cachorro");
		lista.add("Gato");
		
		try {
			System.out.println(lista.get(3));
		} catch (IndexOutOfBoundsException testeErro) {
			System.out.println(testeErro);
		}
		
	}

}
