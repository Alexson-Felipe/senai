import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa para ler o salário de 5 funcionários, sua matriz deve
 * armazenar o nome e o salário de cada funcionário, sendo assim a matriz terá o
 * tamanho de 5 linhas e 2 colunas. Dica: Use a [x][0] para armazenar o nome e
 * [x][1] para armazenar o salário; Após a leitura desses dados o programa deve
 * fornecer uma pesquisa ao usuário, onde o mesmo vai informar um valor e o
 * programa deverá mostrar o nome e o salário dos funcionários que recebem mais
 * do que o salário que deseja ser pesquisado.
 *
 */

public class Ativ03d {

	static String[][] funcionario;
	static Double pesquisa;

	public static void main(String[] args) {

		funcionario = new String[5][2];

		for (int i = 0; i < 5; i++) {

			funcionario[i][0] = JOptionPane.showInputDialog("Digite o nome do funcionario: ");
			funcionario[i][1] = JOptionPane.showInputDialog("Digite o salario do funcionario: ");

		}

		pesquisa = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de salario"));

		for (int i = 0; i < 5; i++) {

			if (Double.parseDouble(funcionario[i][1]) > pesquisa) {
				System.out.println("O salario do funcionario: " + funcionario[i][0] + " que é " + funcionario[i][1]
						+ " é maior que o salario informado " + pesquisa);
			}
		}

	}

}
