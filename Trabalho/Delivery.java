//exemplo criar venda  Teclado pc - 89.90; Monitor 22 - 899.90; Monitor 32 - 1899.90; Controle Xbox - 110.00; Controle PS5 - 149.99; Mouse Razer - 349.00

import javax.swing.JOptionPane;

public class Delivery {

	// Variaveis e Registros
	static int menu = 0;
	static int quantidade = 100;

	static Vendas[] venda;
	static Vendas novaVenda;
	static int contVenda;
	static String[] queroProdutos;
	static int[] produtosVendas;
	static int quantProdutos;

	static class Vendas { // VENDA
		int codigoVendas, clienteVenda;
		String descricaoVendas;
		int prodVenda;
		Cliente clienteVendas;
	}

	static Produto[] produto;
	static Produto novoProduto;
	static int contProduto;
	static String[] produtosCadastrar, separaProduto;

	static class Produto { // PRODUTO
		int codigoProduto;
		String nomeProduto;
		double valor;
	}

	static Cliente[] cliente;
	static Cliente novoCliente;
	static int contCliente = 0;

	static class Cliente { // CLIENTE
		int codigo, cpf, telefone;
		String nome;
	}
	// Fim Variaveis e Registros

	public static void main(String[] args) {
		// Definindo o tamanho de todos vetores Memoria;
		venda = new Vendas[quantidade];
		cliente = new Cliente[quantidade];
		produto = new Produto[100];

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

	
	private static void fazVenda() {
		
		menu = 0;
		menu = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Criar Venda\n2 - Editar Venda\n3 - Visualizar Venda\n4 - Voltar"));


			switch (menu) {
			case 1:

				criaVenda();

				break;
			case 2:

				editarVenda();

				break;
			case 3:
				
				visualizarVenda();
			case 4:
				//Volta
				break;	
				
			default:
				fazVenda();
				break;
			}

	}

	private static void criaVenda() {

		novaVenda = new Vendas();

		do {

			novaVenda.descricaoVendas = JOptionPane.showInputDialog("Descrição da venda");

			if (novaVenda.descricaoVendas.length() >= 5) {

				do {
					quantProdutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos deseja 1 a 5"));
					produtosVendas = new int[quantProdutos];

					if (quantProdutos >= 1 && quantProdutos <= 5) {

						queroProdutos = JOptionPane.showInputDialog("Quais produtos: Ex: 0,1,2,3,5,8...").split(",");

						// Adiciona os produtos na venda
						for (int i = 0; i < queroProdutos.length; i++) {
							for (int j = 0; j < quantProdutos; j++) {
								if (Integer.parseInt(queroProdutos[i]) == produto[j].codigoProduto) {
									novaVenda.prodVenda = produto[j].codigoProduto;

								}
							}
						}
						
						for (int i = 0; i < contVenda; i++) {
							
							System.out.println(venda[i].prodVenda);
						}

						// Vincula os produtos ao cliente.
						int qualCliente = 0;
						qualCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual o código do cliente"));

						for (int i = 0; i < contCliente; i++) {
							if (qualCliente == cliente[i].codigo) {

								novaVenda.clienteVendas = cliente[i];
								venda[contVenda] = novaVenda;
							}

						}

					} else {

						JOptionPane.showMessageDialog(null, "Quantidade invalida");
					}

				} while (quantProdutos <= 0 || quantProdutos > 5);

				contVenda++;

			} else {
				JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");

			}

		} while (novaVenda.descricaoVendas.length() < 5);

	}

	private static void editarVenda() {

		int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Codigo da venda que deseja editar"));

		for (int i = 0; i < contVenda; i++) {
			if (venda[i].codigoVendas == pesquisa) {
				do {

					menu = 0;
					menu = Integer.parseInt(
							JOptionPane.showInputDialog("1 - Descricao da Venda \n2 - Voltar"));

					switch (menu) {
					case 1:
						
						do {
							
							venda[i].descricaoVendas = JOptionPane.showInputDialog("Descrição da venda");
							
							if (venda[i].descricaoVendas.length() < 5) {
								JOptionPane.showMessageDialog(null,"Numero de caracteres precisa ser superior ou igual a 5");
							}

						} while (venda[i].descricaoVendas.length() < 5);
						
						break;
					case 2:

						break;
					default:
						JOptionPane.showMessageDialog(null, "Opcao invalida");
						break;
					}
				} while (menu <= 0 || menu >= 3);

			}

		}

	}
	
	private static void visualizarVenda() {
		int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto para visualizar"));
		
		for (int i = 0; i < contVenda; i++) {
			if (pesquisa == venda[i].codigoVendas) {
				JOptionPane.showMessageDialog(null,"Codigo: " + venda[i].codigoVendas
						+ "\nDescricao: " + venda[i].descricaoVendas 
						+ "\nQuantidade Produtos: " + venda[i].prodVenda
						+ "\nCliente: " + venda[i].clienteVendas.codigo + " " + venda[i].clienteVendas.nome);
					
			}
		}
		
	}
	
	// Fim Menu Vendas.

	// Procedimento Menu Produtos
	private static void fazProdutos() {

		menu = 0;
		menu = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Importar produto \n2 - Editar produto \n3 - Visualizar produto" + "\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:

				produtosCadastrar = JOptionPane
						.showInputDialog("Digite as informações do produto \nExe: Teclado pc - 89.90;").split(";");

				for (int i = 0; i < produtosCadastrar.length; i++) {

					novoProduto = new Produto();

					separaProduto = produtosCadastrar[i].split("-");

					novoProduto.nomeProduto = separaProduto[0];
					novoProduto.valor = Double.parseDouble(separaProduto[1]);
					novoProduto.codigoProduto = i;

					produto[i] = novoProduto;

				}

				break;
			case 2:

				int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto deseja editar?"));

				for (int i = 0; i < produtosCadastrar.length; i++) {

					if (pesquisa == produto[i].codigoProduto) {

						do {
							menu = Integer.parseInt(
									JOptionPane.showInputDialog("1 - Alterar descrição\n2 - Alterar valor\n3 - Sair"));
							switch (menu) {
							case 1:
								produto[i].nomeProduto = JOptionPane.showInputDialog(
										"Nome do produto: " + produto[i].nomeProduto + "\nDigite um novo nome");
								break;
							case 2:
								produto[i].valor = Double.parseDouble(JOptionPane.showInputDialog(
										"Valor do produto: " + produto[i].valor + "\nDigite um novo valor"));
								break;
							}

						} while (menu > 0 && menu < 3);
					}
				}

				break;
			case 3:
				pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto deseja visualizar?"));

				for (int i = 0; i < produtosCadastrar.length; i++) {

					if (pesquisa == produto[i].codigoProduto) {

						JOptionPane.showMessageDialog(null, "Codigo Produto: " + produto[i].codigoProduto
								+ "\nDescricao: " + produto[i].nomeProduto + "\nValor: " + produto[i].valor);
					}

				}

				break;

			default:
				break;
			}
		}
	}
	// Fim Menu Produtos.

	private static void fazCliente() {

		// cliente = new Cliente[quantidade];
		menu = 0;
		menu = Integer.parseInt(JOptionPane
				.showInputDialog("1 - Criar cliente \n2 - Editar cliente \n3 - Visualizar cliente" + "\n4 - Voltar"));

		if (menu >= 1 && menu <= 4) {

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

		} else if (menu <= 0 || menu >= 5) {
			JOptionPane.showMessageDialog(null, "Opção não encontrada");
			fazCliente();
		}
	}

	private static void criadorDeCliente() {

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

						JOptionPane.showMessageDialog(null,
								"Cadastro realizado com sucesso " + "\nSeu codigo: " + contCliente);

						novoCliente.codigo = contCliente;
						cliente[contCliente] = novoCliente;
						contCliente++;

					} else {
						JOptionPane.showMessageDialog(null, "Numero de caracteres precisa igual a 8");
					}

				} while (Integer.toString(novoCliente.cpf).length() != 8);

				// Fim validacao CPF

			} else {
				JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");
			}

		} while (novoCliente.nome.length() < 5);
		// break;

		// }//Fim do for

	}

	private static void editarCliente() {

		// cliente = new Cliente[contCliente + 1];

		int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));

		for (int i = 0; i < contCliente; i++) {// contCliente
			if (pesquisa == cliente[i].codigo) {
				do {
					menu = 0;
					menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha o campo que você deseja editar"
							+ "\n1 - Nome\n2 - CPF\n3 - Telefone\n4 - Cancelar"));

					switch (menu) {
					case 1:
						do {
							novoCliente = new Cliente();
							novoCliente.nome = JOptionPane.showInputDialog("Novo nome");
							if (novoCliente.nome.length() >= 5) {
								JOptionPane.showMessageDialog(null, "Alterado com sucesso");
								cliente[i] = novoCliente;
							} else {
								JOptionPane.showMessageDialog(null,
										"Numero de caracteres precisa ser superior ou igual a 5");
							}
						} while (novoCliente.nome.length() < 5);

						break;

					case 2:

						do {
							novoCliente = new Cliente();
							novoCliente.cpf = Integer.parseInt(JOptionPane.showInputDialog("Novo CPF"));
							if (Integer.toString(novoCliente.cpf).length() == 8) {
								JOptionPane.showMessageDialog(null, "Alterado com sucesso");
							} else {
								JOptionPane.showMessageDialog(null, "Numero de caracteres precisa igual a 8");
							}
						} while (Integer.toString(novoCliente.cpf).length() != 8);
						break;

					case 3:
						cliente[i] = new Cliente();
						cliente[i].telefone = Integer.parseInt(JOptionPane.showInputDialog("Novo Telefone"));
						JOptionPane.showMessageDialog(null, "Alterado com sucesso");
						break;
					default:
						break;
					}

				} while (menu > 0 && menu < 4);
				break;
			}

		}

	}

	private static void visualizaCliente() {

		int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual cliente deseja visualizar?"));

		for (int i = 0; i < contCliente; i++) {

			if (pesquisa == cliente[i].codigo) {
				System.out.println("\nCodigo: " + cliente[i].codigo + "\nNome: " + cliente[i].nome + "\nCPF: "
						+ cliente[i].cpf + "\nTelefone: " + cliente[i].telefone);
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

}
