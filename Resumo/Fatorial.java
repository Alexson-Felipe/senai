/**
 * 
 * Exemplo 3 - Escreva um algoritmo que calcule N! (fatorial de N), sendo que o
 * valor inteiro de N é fornecido pelo usuário. Faça a validação de dados de
 * forma que N seja positivo . 
 * 
 * Sabe-se que: 5! = 5 x 4 x 3 x 2 x 1 = 120 
 * 0! = 1,
 * 
 * por definição
 *
 */

public class Fatorial {

	static int result, resulta = 1;
	
	public static void main(String[] args) {
		
		int fact = 1;
		
	      for( int i = 1; i <= 5; i++ ) {
	         fact *= i;
	      }
	      
	      System.out.println(fact);
	 
		
	   }
	 

}
