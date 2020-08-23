package exercicios;

public class ExcecaoTres {
		
	
		public static double divisao(double valorUm, double valorDois) throws ArithmeticException {
			 if(valorDois == 0)
			        throw new ArithmeticException("O divisor nao pode ser 0 !");
			    return valorUm/valorDois;
			}

			
			}



