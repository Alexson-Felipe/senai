
import javax.swing.JOptionPane;


/**
 * 
 * Desenvolva um programa que gerencie o RH de uma empresa. A empresa atualmente
 * possui 10 funcionários e precisa armazenar as seguinte informações:
 * 
 * ● Matrícula do funcionário(valor inteiro de 1 a 15) 
 * ● Nome do funcionário;
 * ● Data de nascimento; 
 * ● Data da contratação; 
 * ● Salário atual;
 * 
 * Após inserir todas as informações, o programa deverá mostrar um menu
 * com essas opções:
 * 
 * 1 - Listar todos os nomes dos funcionários;
 * 2 - Listar todas as informações de todos os funcionários;
 * 3 - Pesquisar por alguma matrícula;
 * 4 - Alterar o salário de um funcionário;
 * 
 * ●   Programa deve solicitar a matrícula do funcionário que precisa ter
 *     seu salário alterado;
 * 
 * ●   O usuário deve informar o novo salário do funcionário;
 * 
 * 5 - Sair da aplicação
 *
 */
public class Ativ06d {

	static String[][] rhEmpresa;
	static int menu, pesMatricula;

	public static void main(String[] args) {

		int func = 4;
		rhEmpresa = new String[func][5];

		// Cadastro de Informações
		for (int i = 0; i < func; i++) {

			rhEmpresa[i][0] = JOptionPane.showInputDialog("Numero da Matricula de 1 a 15");
			rhEmpresa[i][1] = JOptionPane.showInputDialog("Nome do Funcionario");
			rhEmpresa[i][2] = JOptionPane.showInputDialog("Data de Nascimento");
			rhEmpresa[i][3] = JOptionPane.showInputDialog("Data de Contratação");
			rhEmpresa[i][4] = JOptionPane.showInputDialog("Salario Atual");

		}

		do {
			
			// Menu
			menu = Integer.parseInt(JOptionPane.showInputDialog("MENU"
					+ "\n[1] - Listar nomes dos funcionarios \n[2] - Listar inf completa dos funcionarios  \n[3] - Pesquisar matricula \n[4] - Alterar salario do funcionario \n[5] - Sair"));
			
			switch (menu) {
			case 1:
				
				//Lista nomes.

				for (int i = 0; i < func; i++) {
					System.out.println(rhEmpresa[i][1]);
				}
				
				break;

			case 2:
				
				//Lista informaçoes completa.

				
				for (int i = 0; i < func; i++) {

					System.out.println("Nº Matricula: " + rhEmpresa[i][0] + "\nNome: " + rhEmpresa[i][1] + "\nData N: "
							+ rhEmpresa[i][2] + "\nData C: " + rhEmpresa[i][3] + "\nSalario: " + rhEmpresa[i][4]
							+ "\n---------------");
				}
				

				break;

			case 3:

				
				// Pesquisa matricula
				do {

					pesMatricula = Integer
							.parseInt(JOptionPane.showInputDialog("Numero da matricula que deseja pesquisar 1 a 15"));

					if (pesMatricula > 0 && pesMatricula <= 15) {
						for (int i = 0; i < func; i++) {

							if (pesMatricula == Integer.parseInt(rhEmpresa[i][0])) {
								
								System.out.println("Nº Matricula: " + rhEmpresa[i][0] + "\nNome: " + rhEmpresa[i][1]
										+ "\nData N: " + rhEmpresa[i][2] + "\nData C: " + rhEmpresa[i][3]
										+ "\nSalario: " + rhEmpresa[i][4] + "\n---------------");
							}

						}
					} else {
						System.out.println("NUMERO DA MATRICULA INVALIDO");
					}
				} while (pesMatricula > 0 && pesMatricula <= 15);
				break;
				
			case 4:

				// Alterar salario do funcionario

				do {
					pesMatricula = Integer
							.parseInt(JOptionPane.showInputDialog("Nº da matricula para ajuste de salario"));

					if (pesMatricula > 0 && pesMatricula <= 15) {
						
						for (int i = 0; i < func; i++) {
							
							if (pesMatricula == Integer.parseInt(rhEmpresa[i][0])) {
								
								rhEmpresa[i][4] = JOptionPane.showInputDialog("Digite um novo salario");
								
								System.out.println("O novo salario " + rhEmpresa[i][4]);
								
							}

						}
					} else {
						System.out.println("NUMERO DA MATRICULA INVALIDO");
					}

				} while (pesMatricula > 0 && pesMatricula <= 15);
				break;

			default:
				System.out.println("saiu");
				break;
			}

		} while (menu < 5);

	}

}
