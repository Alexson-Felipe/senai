import javax.swing.JOptionPane;

public class Delivery {

	static int menu = 0;

	static Vendas[] venda;
	static Vendas novaVenda;

	static Cliente novoCliente;
	// static Cliente[] codigo;

	public class Vendas {
		int codigoVendas, produtosVendas; // clienteVendas;
		String descricaoVendas;
		Cliente clientevendas;
	}
	
	public class Produto{
		String produtosCadastrar
	}

	static class Cliente {
		int codigo, cpf, telefone;
		String nome;
	}

	public static void main(String[] args) {
		venda = new Vendas[1];

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

	//Procedimento Menu Vendas
	
	private static void fazVenda() {

		menu = 0;
		menu = Integer.parseInt(
				JOptionPane.showInputDialog("1 - Criar Venda\n2 - Editar Venda\n3 - Visualizar Venda\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:

				break;

			default:
				break;
			}
		}

	}
	
	//Fim Menu Vendas.
	
	

	private static void fazProdutos() {
		// TODO Auto-generated method stub
		menu = 0;
		menu = Integer.parseInt(JOptionPane.showInputDialog(
				"1 - Importar produto \n2 - Editar produto \n3 - Visualizar produto" + "\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:

				break;

			default:
				break;
			}
		}
	}

	private static void fazCliente() {
		
		menu = 0;
		menu = Integer.parseInt(JOptionPane
				.showInputDialog("1 - Criar cliente \n2 - Editar cliente \n3 - Visualizar cliente" + "\n4 - Voltar"));

		if (menu >= 1 && menu <= 3) {

			switch (menu) {
			case 1:

				CriadorDeCliente();

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


	private static void CriadorDeCliente() {

		do {

			novoCliente = new Cliente();
			novoCliente.nome = JOptionPane.showInputDialog("Digite seu nome completo");

			if (novoCliente.nome.length() >= 5) {

				//CPF
				do {
					novoCliente.cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu cpf"));

					if (Integer.toString(novoCliente.cpf).length() >= 5) {
						novoCliente.telefone = Integer
								.parseInt(JOptionPane.showInputDialog("Digite o seu numero de telefone"));
						novoCliente.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do cliente"));
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
					} else {
						JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");
					}
				} while (Integer.toString(novoCliente.cpf).length() < 5); //Fim validacao CPF

			} else {
				JOptionPane.showMessageDialog(null, "Numero de caracteres precisa ser superior ou igual a 5");
			}

		} while (novoCliente.nome.length() < 5);

	}

}
