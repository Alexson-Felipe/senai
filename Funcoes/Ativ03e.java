import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que leia o nome de 10 cidades, após ler esses nomes
 * você deve mostrar a quantidade de vogais que tem no nome de cada cidade
 * digitada. Os nomes das cidades devem ser armazenados em um vetor.
 *
 * 
 */
public class Ativ03e {

	static String[] nomeCidades;
	static int[] quantidadeVogais;

	public static void main(String[] args) {

		nomeCidades = new String[1];

		// Solicita o nome.
		for (int i = 0; i < nomeCidades.length; i++) {

			nomeCidades[i] = JOptionPane.showInputDialog("Nome da Cidade " + i);

		}

		// Chama o metodo
		quantidadeVogais = vogaisMetodo(nomeCidades);

		for (int i = 0; i < nomeCidades.length; i++) {

			System.out.println("Cidade " + nomeCidades[i] + " tem " + quantidadeVogais[i] + " vogais.");
		}

	}

	// Verifica vogais
	private static int[] vogaisMetodo(String[] nomeCidades2) {

		char[] quantVogal;
		int quant = 1;
		int[] quantidade = null;
		quantidade = new int[nomeCidades.length];

		for (int i = 0; i < nomeCidades2.length; i++) {

			nomeCidades2[i] = nomeCidades2[i].toLowerCase();
			quantVogal = nomeCidades2[i].toCharArray();

			for (int j = 0; j < quantVogal.length; j++) {

				// System.out.println();

				switch (quantVogal[j]) {

				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':

					quantidade[i] = quant++;
					break;

				}

			}
			quant = 1;

		}

		return quantidade;
	}
	// Fim

}
