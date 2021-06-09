import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que leia uma matriz de números decimais positivos e
 * negativos de 4 linhas e 4 colunas. Depois utilize um método que substitua os
 * valores negativos por 0, os positivos não devem ser alterados. Depois mostre
 * como ficou a matriz depois dessas alterações..
 * 
 */
public class Caso07d {

	static int[][] matriz;

	public static void main(String[] args) {

		matriz = new int[4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor negativo ou positivo"));

				if (matriz[i][j] < 0) {
					matriz[i][j] = 0;
				}
				System.out.println(matriz[i][j]);
			}
		}

	}

}
