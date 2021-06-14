import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que leia dois vetores de tamanho 10 e depois armaze a soma
 * de cada vetor em uma posição da matriz. Exemplo: M[0][0] = V1[0] + V2[0] ....
 *
 */

public class Caso09d {
	
	static int[] vetor1, vetor2;
	static int[][] matriz;

	public static void main(String[] args) {
		
		vetor1 = new int[10];
		vetor2 = new int[vetor1.length];
		matriz = new int[vetor1.length][vetor1.length];
		
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor 1"));
			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor 2"));
			
			matriz[i][i] = vetor1[i] + vetor2[i];
			
		}
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(matriz[i][i]);
		}

	}

}
