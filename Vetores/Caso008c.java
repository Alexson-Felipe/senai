
import javax.swing.JOptionPane;

/**
 * 
 * Faça um programa que leia um vetor de 10 posições e verifique se existem
 * valores iguais e os escreva na tela.
 *
 */
public class Caso008c {

	static int[] posicoes, numerosIguais;
	static int aux = 1;

	public static void main(String[] args) {

		posicoes = new int[10];
		numerosIguais = new int[posicoes.length];

		for (int i = 0; i < posicoes.length; i++) {

			posicoes[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor na posição " + i));

			if (i == (posicoes.length - 1)) {

				for (int j = 0; j < posicoes.length; j++) {
					for (int k = j + 1; k < posicoes.length; k++) {
						if (posicoes[j] == posicoes[k]) {
							System.out.println("Iguais " + posicoes[j]);
						}
					}
				}
			}
		}
	}

}
