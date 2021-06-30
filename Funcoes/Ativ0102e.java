import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que solicite ao funcionário seu nome, cargo(deve ser
 * solicitado G para gerência ou P produção) e seu salário. Através de uma
 * função você deve calcular o reajuste do salário. Para cargo de gerência o
 * reajuste vai ser de 8% e para o cargo de produção o reajuste vai ser de 5%. A
 * função deve receber o cargo e o salário por parâmetro e retornar o novo
 * salário. Depois mostre o nome da pessoa, seu cargo e o novo salário.
 *
 */

public class Ativ0102e {

	static String[][] dadosFuncionario;
	static double calculoSalario;

	public static void main(String[] args) {

		dadosFuncionario = new String[1][3];

		for (int i = 0; i < dadosFuncionario.length; i++) {

			dadosFuncionario[i][0] = JOptionPane.showInputDialog("Nome do Funcionario");
			dadosFuncionario[i][1] = JOptionPane.showInputDialog("Cargo G gerência e P produção").toUpperCase();
			dadosFuncionario[i][2] = JOptionPane.showInputDialog("Salario");

			calculoSalario = salarioNovo(dadosFuncionario[i][1], dadosFuncionario[i][2]);

			System.out.println("Nomes: " + dadosFuncionario[i][0] + "\nCargo: " + dadosFuncionario[i][1]
					+ "\nSalario: R$" + String.format("%.2f", calculoSalario));

		}

	}

	private static double salarioNovo(String cargo, String salario) {

		cargo = cargo.toUpperCase();
		switch (cargo.charAt(0)) {
		case 'G':

			return Double.parseDouble(salario) * 1.08;

		case 'P':

			return Double.parseDouble(salario) * 1.05;

		default:
			cargo = JOptionPane.showInputDialog("CARGO INVALIDO \nDigite um cargo valido\nG gerência e P produção ");
			return salarioNovo(cargo, salario);

		}

	}

}
