import javax.swing.JOptionPane;

/**
 * 
 * Leia um vetor inteiro de 10 posições e depois mostre eles informando se o
 * número apresentado é positivo ou negativo.
 *
 */
public class Caso009c {

	static int[] vetorPN;

	public static void main(String[] args) {

		vetorPN = new int[10];

		for (int i = 0; i < vetorPN.length; i++) {

			vetorPN[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));

			if (vetorPN[i] >= 0) {
				JOptionPane.showMessageDialog(null, "Esse valor é Positivo " + vetorPN[i]);
			} else if (vetorPN[i] < 0) {
				JOptionPane.showMessageDialog(null, "Esse valor é Negativo " + vetorPN[i]);
			}

		}

	}

}
