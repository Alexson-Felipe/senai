import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que leia uma matriz de números decimais positivos 5 linhas
 * e 4 colunas. Depois utilize um método que faça a média de todos os elementos
 * informados e mostre quais numeros digitados estão acima da media gerada.
 *
 */

public class Caso08d {

	static int[][] matriz;
	static double media;
	
	public static void main(String[] args) {
		
	matriz = new int[5][4];
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 4; j++) {
			matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		}
	}
		
	}

}
