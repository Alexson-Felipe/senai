import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que gerencie o cadastro de camisetas de uma marca. O
 * registro de camisetas precisa armazenar os seguintes dados: código da
 * camiseta(número inteiro), modelo da camiseta, cor da camiseta, tamanho da
 * camiseta (P, M, G, GG e Extra), quantidade disponível, valor unitário. O
 * programa deve permitir o cadastro de 10 camisetas. Depois das vendas
 * cadastradas o sistema deve apresentar um menu com as seguintes opções.
 * 
 * 1- Pesquisar a camiseta pelo código 
 * 2- Mostrar um relatório de camisetas pelo tamanho cadastrado 
 * 3- Mostrar um relatório de camisetas pelo modelo cadastrado;
 * 
 * relatório é preciso mostrar o valor total em estoque(quantidade x preço unitário); 
 * 
 * 4- Fechar programa 
 * 
 * Essas opções devem ser realizadas através de procedimentos.
 * 
 */
public class Ativ001g {
	
	static RegistroCamisas[] camisas;
	static RegistroCamisas novasCamisas;
	static int menu;
	
	static class RegistroCamisas{
		int codCamiseta, quantidadeDisponivel;
		String corCamiseta, tamanho, modelo;
		double valorUnitario;
	}
	
	public static void main(String[] args) {
		
		camisas = new RegistroCamisas[10];
		
		for (int i = 0; i < camisas.length; i++) {
			
			novasCamisas = new RegistroCamisas();
			
			novasCamisas.codCamiseta = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto"));
			novasCamisas.quantidadeDisponivel = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
			novasCamisas.modelo = JOptionPane.showInputDialog("Qual é o modelo da camisa Longa ou Curta").toUpperCase();
			novasCamisas.corCamiseta = JOptionPane.showInputDialog("Cor");
			novasCamisas.tamanho = JOptionPane.showInputDialog("Tamanho da Camiseta \nP, M, G, GG e E").toUpperCase();
			novasCamisas.valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Valor unitario"));
			
			camisas[i] = novasCamisas;
		
		}
		
		do {
			menu = 0;
			menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Pesquisar a camiseta pelo código"
					+ "\n2 - Mostrar um relatório de camisetas pelo tamanho cadastrado"
					+ "\n3 - Mostrar um relatório de camisetas pelo modelo cadastrado"
					+ "\n4 - Fechar programa"));
			
			switch (menu) {
			case 1:
				pesquisaCamisa(menu);
				break;
			case 2:
				pesquisaCamisa(menu);
				break;
			case 3:
				pesquisaCamisa(menu);
				break;

			default:
				menu = 0;
				break;
			}
			
			
		} while (menu > 0 && menu != 4);
		
	}

	private static void pesquisaCamisa(int menuPesquisa) {

		if (menuPesquisa == 1) {
			int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da venda"));

			for (int i = 0; i < camisas.length; i++) {
				if (camisas[i].codCamiseta == pesquisa) {
					System.out.println("Código: " + camisas[i].codCamiseta + "\nQuantidade disponivel: "
							+ camisas[i].quantidadeDisponivel + "\nModelo: " + camisas[i].modelo + "\nCor: "
							+ camisas[i].corCamiseta + "\nTamanho: " + camisas[i].tamanho + "\nValor unitario: "
							+ camisas[i].valorUnitario);
				}
			}

		} else if (menuPesquisa == 2) {
			String pesquisa = JOptionPane.showInputDialog("Digite o tamanho para pesquisar \nP, M, G, GG e E")
					.toUpperCase();

			for (int i = 0; i < camisas.length; i++) {
				if (camisas[i].tamanho.equals(pesquisa)) {
					System.out.println("Código: " + camisas[i].codCamiseta + "\nQuantidade disponivel: "
							+ camisas[i].quantidadeDisponivel + "\nModelo: " + camisas[i].modelo + "\nCor: "
							+ camisas[i].corCamiseta + "\nTamanho: " + camisas[i].tamanho + "\nValor unitario: "
							+ camisas[i].valorUnitario);
				}
			}

		} else if (menuPesquisa == 3) {
			String pesquisa = JOptionPane
					.showInputDialog("Qual é o modelo da camisa que deseja pesquisar " + "\nLonga ou Curta")
					.toUpperCase();

			for (int i = 0; i < camisas.length; i++) {
				if (camisas[i].modelo.equals(pesquisa)) {
					System.out.println("Código: " + camisas[i].codCamiseta + "\nQuantidade disponivel: "
							+ camisas[i].quantidadeDisponivel + "\nModelo: " + camisas[i].modelo + "\nCor: "
							+ camisas[i].corCamiseta + "\nTamanho: " + camisas[i].tamanho + "\nValor unitario: "
							+ camisas[i].valorUnitario);
				}
			}
		}

	}
}


