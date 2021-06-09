import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que realize a leitura de uma matriz de números decimais
 * de 5 linhas e 5 colunas, e após a leitura, apresente a média de cada linha;
 *
 */

public class Caso05d {

	static int[][] matriz;
	static double media;
	static int soma;

	public static void main(String[] args) {

		matriz = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				matriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Digite o valor da Matriz na posição " + i));
				
				soma += matriz[i][j];
				
				if (j == 4) {
					media = soma / 5;
					System.out.println("A media da linha " + i + " é de " + media);
					media = 0;
					soma = 0;
				}
				

			}

		}

	}

}
