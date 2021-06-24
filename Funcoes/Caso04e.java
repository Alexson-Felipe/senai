import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um algoritmo que realize a leitura de salário e nome de 5
 * funcionários. Os nomes e salários devem ser armazenados nos devidos vetores
 * respeitando o tipo de cada dado. Ao final um terceiro vetor de salários
 * reajustados deve ser apresentado ao usuário. O algoritmo deve ser
 * modularizado para que o reajuste seja realizado por uma função, retornando o
 * resultado ao final ao algoritmo principal.
 *
 */

public class Caso04e {

	public static void main(String[] args) {

		String[] funcionariosNome  = new String[1];
		double[] funcionariosSalario = new double[1];
		double[] reajusteSalario = new double[1];

		for (int i = 0; i < funcionariosNome.length; i++) {
			funcionariosNome[i] = JOptionPane.showInputDialog("Nome");
			funcionariosSalario[i] = Double.parseDouble(JOptionPane.showInputDialog("Salario"));
		}


		
		reajusteSalario = funcSalario(funcionariosSalario, funcionariosNome);

		//com erro
		for (int i = 0; i < funcionariosNome.length; i++) {
			System.out.println(
					funcionariosNome[i] + " ANTES " + funcionariosSalario[i] + " DEPOIS " + reajusteSalario[i]);
		}

	}

	private static double[] funcSalario(double[] funcionariosSalario, String[] funcionariosNome) {
		
		for (int i = 0; i < funcionariosNome.length; i++) {
			
			funcionariosSalario[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo salario para o funcionario " + funcionariosNome[i]));
			
		}
		return funcionariosSalario;
	}


}
