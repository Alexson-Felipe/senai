import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que leia o nome e o salário de 5 funcionários. Sua
 * matriz deve ter o tamanho de 5 linhas e 2 colunas. Depois mostre a soma de
 * todos os salários;
 *
 */

public class Ativ01d {

	static String[][] funcionario;
	// static double[][] salarioFun;
	static double soma;

	public static void main(String[] args) {

		funcionario = new String[5][2];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {

				// 0 0
				funcionario[i][j] = JOptionPane.showInputDialog("Digite seu nome de funcionario");
				// j++;

				// 0 1
				funcionario[i][++j] = JOptionPane.showInputDialog("Digite o salario do funcionario");

			}

		}

		for (int i = 0; i < 5; i++) {
			soma = Double.parseDouble(funcionario[i][1]);

		}

		System.out.println("Soma de todos os salarios: " + soma);

	}

}
