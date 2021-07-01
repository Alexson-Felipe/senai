import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que permita o armazenamento de 5 nomes em um vetor. Após a
 * armazenagem, converta todos os nomes para maiúsculo e mostre ao final. O
 * algoritmo deve ser modularizado em 2 procedimentos além do algoritmo
 * principal.
 *
 */
public class Caso02f {

	static String[] nomes;

	public static void main(String[] args) {

		nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome " + i);
		}

		procedimentoMaiusculo();

	}

	private static void procedimentoMaiusculo() {

		for (int i = 0; i < nomes.length; i++) {

			nomes[i] = nomes[i].toUpperCase();

		}
		procedimentoMostrar();

	}

	private static void procedimentoMostrar() {
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}

}
