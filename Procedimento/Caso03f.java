import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que apresente a tabuada (até 10) de um número inteiro
 * positivo. O algoritmo deve ser modularizado para que a tabuada seja
 * apresentada por um procedimento além do algoritmo principal.
 *
 */

public class Caso03f {
	
	static int tabu;

	public static void main(String[] args) {
		
			tabu = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

		tabuada();
		
	}

	private static void tabuada() {
		
		for (int i = 0; i < 11; i++) {
			System.out.println(tabu+" x "+i+ " = " +(tabu * i));
		}
		
	}

}
