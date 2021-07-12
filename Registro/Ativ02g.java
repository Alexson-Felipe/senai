import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que gerencie as compras de um delivery de lanches. O
 * registro de vendas precisa armazenar os seguintes dados: código da
 * venda(número inteiro), nome do cliente, valor da venda, taxa de entrega,
 * bairro de entrega. O programa deve permitir o cadastro de 10 vendas. Depois
 * das vendas cadastradas o sistema deve apresentar um menu com as seguintes
 * opções.
 * 
 * 1- Pesquisar venda pelo código 
 * 2- Mostrar total vendido 
 * 3- Mostrar o total arrecadado com o valor das entregas 
 * 4- Fechar programa
 * 
 * Essas opções devem ser realizadas através de procedimentos.
 *
 */
public class Ativ02g {

	static Registro[] delivery;
	static Registro novoDelivery;
	static int menu;

	static class Registro {

		int codVenda;
		String nomeCliente, bairroEntrega;
		double valorVenda, taxaEntrega;

	}

	public static void main(String[] args) {
		delivery = new Registro[2];

		for (int i = 0; i < delivery.length; i++) {
			novoDelivery = new Registro();

			novoDelivery.codVenda = Integer.parseInt(JOptionPane.showInputDialog("Código de venda"));
			novoDelivery.nomeCliente = JOptionPane.showInputDialog("Nome do Cliente");
			novoDelivery.bairroEntrega = JOptionPane.showInputDialog("Bairro de Entrega");
			novoDelivery.valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Valor da Venda"));
			novoDelivery.taxaEntrega = Double.parseDouble(JOptionPane.showInputDialog("Taxa de Entrega"));

			delivery[i] = novoDelivery;

		}

		do {
			menu = 0;
			menu = Integer.parseInt(
					JOptionPane.showInputDialog("1 - Pesquisar venda pelo código" + "\n2 - Mostrar total vendido"
							+ "\n3 - Mostrar o total arrecadado com o valor das entregas" + "\n4 - Fechar programa"));

			if (menu > 0 && menu <= 4) {

				switch (menu) {
				case 1:

					pesquisaVenda();
					break;
				case 2:

					totalVendido();
					break;
				case 3:
					totalEntrega();
					break;
				default:
					break;
				}

			} else {
				System.out.println("Digite um valor valido");
				menu = 1;
			}

		} while (menu > 0 && menu != 4);

	}

	// Procedimento de pesquisa, opção 1.
	private static void pesquisaVenda() {

		int pesquisando = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o código da venda que deseja pesquisar"));

		for (int i = 0; i < delivery.length; i++) {

			if (pesquisando == delivery[i].codVenda) {
				System.out.println("Código da Venda: " + delivery[i].codVenda + "\nNome do Cliente: "
						+ delivery[i].nomeCliente + "\nBairro de Entrega: " + delivery[i].bairroEntrega
						+ "\nValor da Venda: " + delivery[i].valorVenda + " Taxa de Entrega: " + delivery[i].taxaEntrega
						+ String.format("\nTotal: %.2f", delivery[i].valorVenda + delivery[i].taxaEntrega));
			} else {
				System.out.println("Pesquisando...");
			}
		}

	}
	// Fim procedimento de pesquisa.

	private static void totalVendido() {
		double soma = 0;
		for (int i = 0; i < delivery.length; i++) {

			soma += delivery[i].valorVenda;

		}
		System.out.println(soma);

	}

	private static void totalEntrega() {
		double soma = 0;
		for (int i = 0; i < delivery.length; i++) {

			soma += delivery[i].taxaEntrega;

		}
		System.out.println("Taxa de entrega soma é de: " + soma);

	}
}
