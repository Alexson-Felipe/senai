import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que realize a leitura de dois vetores, sendo eles de
 * nomes e idades, e cada um contendo 10 posições. Após a leitura, permita a
 * busca de um nome e idade a partir do índice informado pelo usuário. A busca
 * deve ser interrompida quando o usuário digitar um número negativo.
 *
 */

public class Caso05c {

	static String[] nome;
	static int[] idade;
	static int pesquisa;

	public static void main(String[] args) {

		nome = new String[10];
		idade = new int[10];

		for (int i = 0; i < idade.length; i++) {

			nome[i] = JOptionPane.showInputDialog("Digite o nome");
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

		}

		do {
			pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual nome de : 0 a 10 deseja pesquisar"));

			if (pesquisa >= 0 && pesquisa <= 10) {
				JOptionPane.showMessageDialog(null, "Nome: " + nome[pesquisa] + "\nIdade:" + idade[pesquisa]);
			}

		} while (pesquisa > 0);

	}

}
