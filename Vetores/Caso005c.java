import javax.swing.JOptionPane;

/**
 * 
 * Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
 * Calcule a média de todas elas. Exiba a média e depois as notas maiores do que
 * a média calculada.
 *
 */
public class Caso005c {

	static double[] notas, maioresNotas;
	static double mediaDeNotas, somaNotas;
	static int quantidadeDeNotas;

	public static void main(String[] args) {

		quantidadeDeNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas"));
		notas = new double[quantidadeDeNotas];
		maioresNotas = new double[quantidadeDeNotas];

		for (int i = 0; i < quantidadeDeNotas; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do vetor: " + i));
			somaNotas += notas[i];

			if (i == quantidadeDeNotas - 1) {
				mediaDeNotas = somaNotas / quantidadeDeNotas;

				for (int j = 0; j < quantidadeDeNotas; j++) {
					if (mediaDeNotas < notas[j]) {
						maioresNotas[j] = notas[j];
						JOptionPane.showMessageDialog(null, "A média é de: " + mediaDeNotas
								+ "\nNotas maiores que a media calculada: " + maioresNotas[j]);
					}
				}

			}
		}
	}

}
