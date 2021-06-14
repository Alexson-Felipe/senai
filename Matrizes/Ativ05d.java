import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa para ler a matrícula de um funcionário, seu nome e o
 * turno que ele trabalha(matutino, vespertino e noturno). O programa deve
 * permitir o cadastro de 10 funcionários. Após o cadastro uma tela de pesquisa
 * deve ser mostrada e o usuário poderá pesquisar pelas matrículas, caso a
 * pesquisa gere algum resultado, informe o nome e o turno que o funcionário com
 * essa matrícula trabalha.
 *
 */

public class Ativ05d {

	static String[][] funcionarioMatricula;
	static int pesquisa;

	public static void main(String[] args) {

		funcionarioMatricula = new String[10][2];

		for (int i = 0; i < funcionarioMatricula.length; i++) {

			funcionarioMatricula[i][0] = JOptionPane.showInputDialog("Digite o nome: ");
			funcionarioMatricula[i][1] = JOptionPane
					.showInputDialog("Digite \n1 - Matutino \n2 - Vespertino \n3 - noturno ");

			// pesquisa
			if (i == funcionarioMatricula.length - 1) {

				pesquisa = Integer.parseInt(JOptionPane.showInputDialog(
						"Digite o turno do funcionario \n1 - Matutino \n2 - Vespertino \n3 - noturno"));

				for (int j = 0; j < funcionarioMatricula.length; j++) {
					for (int k = 0; k < 2; k++) {

						if ((Integer.parseInt(funcionarioMatricula[i][1])) == pesquisa) {

							System.out.println("Funcionario " + funcionarioMatricula[j][k] + " matricula "
									+ Integer.parseInt(funcionarioMatricula[i][1]));
						}

					}
				}
			}

		}

	}

}
