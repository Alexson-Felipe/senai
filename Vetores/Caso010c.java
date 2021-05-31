

/**
 * 
 * Faça um vetor de tamanho 50 preenchido cada posição com o seguinte valor:
 * (posição *5). Em seguida imprima o vetor na tela.
 *
 */
public class Caso010c {

	static int[] posicaoPre;

	public static void main(String[] args) {

		posicaoPre = new int[50];

		for (int i = 0; i < posicaoPre.length; i++) {
			posicaoPre[i] = i * 5;
		}

		for (int i = 0; i < posicaoPre.length; i++) {
			//JOptionPane.showMessageDialog(null, posicaoPre[i]);
			System.out.println(i + " " + posicaoPre[i]);
		}

	}

}
