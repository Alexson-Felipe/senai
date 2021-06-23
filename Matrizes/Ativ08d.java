import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que controle o carrinho de compras de um supermercado.
 * O aplicativo deve permitir o cadastro de até 10 produtos. O programa deve
 * permitir incluir as seguintes informações para cada produto.
 * 
 * ● Código 
 * ● Descrição 
 * ● Quantidade 
 * ● Valor Unitário 
 * ● Subtotal
 * 
 * O menu principal do sistema deve conter as seguintes opções:
 *
 * 1 - Adicionar produto ao carrinho 
 * 2 - Remover produto por código 
 * 
 * ● Deve ser realizada uma busca no programa pelo código informado pelo usuário e caso o mesmo seja encontrado, deve ser atribuído null nos atributos do carrinho. 
 * 
 * 3 - Ver carrinho
 * 
 * ● Listar todos os produtos, quantidade comprada, subtotal e total 
 * 
 * 4 - Ir para checkout 
 * 
 * ● Mostrar toda a lista dos produtos comprados e o total da venda e depois apresentar a mensagem “”Compra realizada com Sucesso” e fechar o programa.
 * 
 */
public class Ativ08d {

	static String[][] produtos;
	static int menu, cont;

	public static void main(String[] args) {

		int linha = 2;
		produtos = new String[linha][5];

		// MENU
		do {

			menu = Integer.parseInt(JOptionPane.showInputDialog("[1] - Adicionar produto ao carrinho\n"
					+ "[2] - Remover produto por código\n" + "[3] - Ver carrinho\n" + "[4] - Ir para checkout\n"));

			switch (menu) {
			case 1:

				for (int i = 0; i < linha; i++) {
					if (produtos[i][0] == null) {

						produtos[i][0] = JOptionPane.showInputDialog("Código " + i);
						produtos[i][1] = JOptionPane.showInputDialog("Descrição");
						produtos[i][2] = JOptionPane.showInputDialog("Quantidade");
						produtos[i][3] = JOptionPane.showInputDialog("Valor unitário");
						produtos[i][4] = JOptionPane.showInputDialog("Subtotal");
						
						System.out.println("Produto " + produtos[i][0] + " cadastrado.");
						cont = 0;
						
						break;

					} else if (cont == linha - 1) {
						System.out.println("Nenhum campo vazio, excluia algum produto");
						break;
					} else {
						cont++;
					}

				}

				break;

			case 2:
				
				

				break;

			default:
				break;
			}

		} while (menu < 5);

		for (int i = 0; i < linha; i++) {

		}

	}

}
