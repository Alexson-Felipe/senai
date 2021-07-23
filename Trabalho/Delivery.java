import javax.swing.JOptionPane;

public class Delivery {

	// Variaveis e Registros
	static int menu = 0;
	static int quantidade = 100;

	static Vendas[] venda;
	static Vendas novaVenda;
	static int contVenda;

	static class Vendas {
		int codigoVendas, produtosVendas; // clienteVendas;
		String descricaoVendas;
		Cliente clientevenda;
	}

	static Produto[] produto;
	static Produto novoProduto;
	static int contProduto;
	static String[] produtosCadastrar, separaProduto; 

	static class Produto {
		
		int codigo;
		String nomeProduto;
		double valor;
	}

	static Cliente[] cliente;
	static Cliente novoCliente;
	static int contCliente = 0;

	static class Cliente {
		int codigo, cpf, telefone;
		String nome;
	}
	// Fim Variaveis e Registros

	public static void main(String[] args) {
		

		do {
			menu = 0;
			menu = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Vendas\n2 - Produtos\n3 - Clientes\n4 - Relatório\n5 - Finalizar Programa"));

			if (menu >= 1 && menu <= 5) {

				switch (menu) {
				case 1:

					fazVenda();

					break;
				case 2:

					fazProdutos();

					break;
				case 3:

					fazCliente();

					break;
				case 4:

					fazRelatorio();

					break;
				case 5:

					if (menu == 5) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					break;

				default:
					break;
				}

			} else {
				JOptionPane.showMessageDialog(null, "Opção não encontrada");
			}

		} while (menu > 0 && menu < 5);

	}

	// Procedimento Menu Vendas
	private static void fazVenda() {
		venda = new Vendas[quantidade];
		
		menu = 0;
		menu = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Criar Venda\n2 - Editar Venda\n3 - Visualizar Venda\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:

				criaVenda();

				break;

			default:
				break;
			}
		}

	}

	private static void criaVenda() {

		do {

			novaVenda = new Vendas();

			do {
				novaVenda.descricaoVendas = JOptionPane.showInputDialog("Descrição da venda");

				if (novaVenda.descricaoVendas.length() >= 5) {

					//
					venda[contVenda] = novaVenda;
					contVenda++;

				} else {
					JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");

				}
			} while (novaVenda.descricaoVendas.length() < 5);

		} while (novoCliente.nome.length() < 5);

	}
	// Fim Menu Vendas.

	// Procedimento Menu Produtos
	private static void fazProdutos() {

		produto = new Produto[quantidade];
		menu = 0;
		menu = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Importar produto \n2 - Editar produto \n3 - Visualizar produto" + "\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:
				novoProduto = new Produto();

				produtosCadastrar = JOptionPane
						.showInputDialog("Digite as informações do produto \nExe: Teclado pc - 89.90;").split(";");

				for (int i = 0; i < produtosCadastrar.length; i++) {

					novoProduto = new Produto();

					separaProduto = produtosCadastrar[i].split("-");

					novoProduto.nomeProduto = separaProduto[0];
					novoProduto.valor = Double.parseDouble(separaProduto[1]);

					produto[i] = novoProduto;

				}

				for (int i = 0; i < 3; i++) {

					System.out.println(produto[i].nomeProduto);
					
				}

				break;

			default:
				break;
			}
		}
	}
	// Fim Menu Produtos.

	private static void fazCliente() {
		
		cliente = new Cliente[quantidade];
		menu = 0;
		menu = Integer.parseInt(JOptionPane
				.showInputDialog("1 - Criar cliente \n2 - Editar cliente \n3 - Visualizar cliente" + "\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:

				criadorDeCliente();

				break;
			case 2:
				editarCliente();
				break;
			case 3:
				visualizaCliente();
				break;
			default:
				break;
			}

		} else {
			JOptionPane.showMessageDialog(null, "Opção não encontrada");
		}
	}

	private static void editarCliente() {
		// TODO Auto-generated method stub
		cliente = new Cliente[contCliente +1];
		
		

		int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
		
		for (int i = 0; i < cliente.length ; i++) {
			if (pesquisa == cliente[i].codigo) {
				do {
					menu = 0;
					menu = Integer.parseInt(JOptionPane
							.showInputDialog("Escolha o campo que você deseja editar"+"\n1 - Nome\n2 - CPF\n3 - Telefone"));
				} while (menu > 0 && menu < 4);
				
				
			}

			}
		
	}
			
	private static void visualizaCliente() {

		cliente = new Cliente[contCliente];

		int pesquisa = Integer.parseInt(null);

		for (int i = 0; i < cliente.length; i++) {
			if (pesquisa == cliente[i].codigo) {

			}
		}

	}

	private static void fazRelatorio() {

		menu = 0;
		menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Relatório de vendas \n2 - Relatório de vendas "
				+ "\n3 - Relatório de produtos \n4 - Relatório de produtos \n5 - Relatório de clientes"));

		if (menu >= 1 && menu <= 3) {
			switch (menu) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			default:
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Opção não encontrada");
		}
	}

	private static void criadorDeCliente() {

		cliente = new Cliente[quantidade];

		do {

			novoCliente = new Cliente();
			novoCliente.nome = JOptionPane.showInputDialog("Digite seu nome completo");

			if (novoCliente.nome.length() >= 5) {

				// CPF
				do {
					novoCliente.cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cpf"));

					if (Integer.toString(novoCliente.cpf).length() == 8) {
						novoCliente.telefone = Integer
								.parseInt(JOptionPane.showInputDialog("Digite o seu numero de telefone"));

						cliente[contCliente] = novoCliente;

						JOptionPane.showMessageDialog(null,
								"Cadastro realizado com sucesso " + "\nSeu codigo: " + contCliente);
						contCliente++;

					} else {
						JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");
					}
				} while (Integer.toString(novoCliente.cpf).length() != 8);

				// Fim validacao CPF

			} else {
				JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");
			}

		} while (novoCliente.nome.length() < 5);

	}

}
