package exercicios;

public class ExcecaoTresTeste {

	public static void main(String[] args) {
		
		ExcecaoTres exc = new ExcecaoTres();
		
		try {
			System.out.println(ExcecaoTres.divisao(4, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
