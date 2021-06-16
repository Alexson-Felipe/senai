import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa para ler a matrícula de um funcionário, seu nome e o
 * turno que ele trabalha(matutino, vespertino e noturno). O programa deve
 * permitir o cadastro de 5 funcionários. Após o cadastro uma tela de pesquisa
 * deve ser mostrada e o usuário poderá pesquisar pelas matrículas, caso a
 * pesquisa gere algum resultado, informe o nome e o turno que o funcionário com
 * essa matrícula trabalha.
 *
 */

public class Ativ05d {

	static String[][] funcionarioMatricula;
	static int pesquisa;

	public static void main(String[] args) {

		funcionarioMatricula = new String[5][3];

		for (int i = 0; i < 5; i++) {
			funcionarioMatricula[i][0] = JOptionPane.showInputDialog("Digite a matricula");
			funcionarioMatricula[i][1] = JOptionPane.showInputDialog("Digite o nome");
			funcionarioMatricula[i][2] = JOptionPane.showInputDialog("Turno que trabalha");
		}
		
		pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula que será pesquisada"));
		
		for (int i = 0; i < 5; i++) {
			
			if (Integer.parseInt(funcionarioMatricula[i][0]) == pesquisa ) {
				System.out.println(funcionarioMatricula[i][1] + " Trabalha no turno: " + funcionarioMatricula[i][2]);
			}
			
		}

	}

}
