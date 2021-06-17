import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que controle os chamados de Tecnologia da Informação
 * de uma empresa. O administrador deverá informar a quantidade de chamados
 * abertos no dia. Para cada chamado é necessário ter essas informações:
 * 
 * ● Código chamado (número inteiro) 
 * ● Título do chamado; 
 * ● Nome do funcionário que abriu o chamado; 
 * ● Status do chamado(Aberto / Fechado);
 *
 * Após o cadastro dos chamados um menu deve ser apresentado:
 *
 * 1 - Listar todos os chamados com suas respectivas informações; 
 * 2 - Pesquisar pelo código do chamado; 
 * 3 - Alterar o status do chamado:
 * ● O programa deve solicitar o código do chamado; 
 * ● O usuário deve informar o novo status do chamado; 
 * 
 *	4 - Listar somente os chamados abertos; 
 *  5 - Listar somente os chamados fechados; 
 *  6 - Listar a quantidade de chamados abertos; 
 *  7 - Listar a quantidade de chamados fechados;
 *  
 */
public class Ativ07d {
	
	static int quantChamados, menu;
	static String[][] chamado;
	

	public static void main(String[] args) {
		
		quantChamados = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de chamados"));
		chamado = new String[quantChamados][4];
		
		for (int i = 0; i < quantChamados; i++) {
			
			chamado[i][0] = JOptionPane.showInputDialog("Código do chamado");
			chamado[i][1] = JOptionPane.showInputDialog("Título do chamado");
			chamado[i][2] = JOptionPane.showInputDialog("Funcionário que abriu o chamado");
			chamado[i][3] = JOptionPane.showInputDialog("Status do chamado \n[1]ABERTO \n[2]FECHADO");
			
		}
			
		do {
			//Menu
		menu = Integer.parseInt(JOptionPane.showInputDialog(
				"MENU \n[1] - Lista todos os chamados "
				+ "\n[2] - Pesquisa pelo código do chamado "
				+ "\n[3] - Altera o status do chamado "
				+ "\n[4] - Lista chamados ABERTO "
				+ "\n[5] - Lista chamados FECHADO "
				+ "\n[6] - Lista a quantidade de chamados ABERTO "
				+ "\n[7] - Lista a quantidade de chamados FECHADO"));

		switch (menu) {
		case 1:
			
			break;

		default:
			break;
		}
		
		} while (menu > 0 && menu < 8);
		
	}

}
