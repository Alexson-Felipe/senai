import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que leia o nome completo de 10 pessoas, após ler esses
 * nomes você deve mostrar todos eles em caixa alta e um único JOptionPane. Os
 * nomes solicitados devem ser armazenados em um vetor.
 * 
 */
public class Ativ01e {

	static String[] nomeCompleto;

	public static void main(String[] args) {

		nomeCompleto = new String[10];

		for (int i = 0; i < nomeCompleto.length; i++) {

			nomeCompleto[i] = JOptionPane.showInputDialog("Digite o nome completo");

		}

		JOptionPane.showMessageDialog(null,
				nomeCompleto[0].toUpperCase() + "\n " + nomeCompleto[0].toUpperCase() + "\n "
						+ nomeCompleto[1].toUpperCase() + "\n " + nomeCompleto[2].toUpperCase() + "\n "
						+ nomeCompleto[3].toUpperCase() + "\n " + nomeCompleto[4].toUpperCase() + "\n "
						+ nomeCompleto[5].toUpperCase() + "\n " + nomeCompleto[6].toUpperCase() + "\n "
						+ nomeCompleto[7].toUpperCase() + "\n " + nomeCompleto[8].toUpperCase() + "\n "
						+ nomeCompleto[9].toUpperCase());

	}

}
