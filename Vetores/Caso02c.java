import java.util.Iterator;

import javax.swing.JOptionPane;

public class Caso02c {

	static int[] vetor1, vetor2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vetor1 = new int[4];
		vetor2 = new int[4];

		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

		}

		for (int i = 0; i < 4; i++) {

			vetor2[i] = vetor1[i];
		}

		for (int i = vetor1.length - 1; i >= 0; i--) {
			JOptionPane.showMessageDialog(null, "Vetor 2 na posição " + "" + i + " tem o valor de: " + vetor2[i]);
		}

	}

}
