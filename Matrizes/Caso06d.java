import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que leia uma matriz de números decimais de 5 linhas e 5
 * colunas. Depois utilize um método que substitua substitui seus elementos de
 * valor ímpar por -1 e os pares por +1.
 *
 */

public class Caso06d {
	
	static int[][] matriz;

	public static void main(String[] args) {
		
		matriz = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para: \nLinha["+i+"] Coluna["+j+"]"));
				
				if (matriz[i][j] % 2 == 0) {
					System.out.print("O Valor PAR passou de " + matriz[i][j]);
					matriz[i][j] = 1;
					System.out.println(" para " + matriz[i][j]);
				}else if(matriz[i][j] % 2 != 0) {
					System.out.print("O Valor IMPAR passou de " + matriz[i][j]);
					matriz[i][j] = -1;
					System.out.println(" para " + matriz[i][j]);
				}
				
			}
		}
		
		
	}

}
