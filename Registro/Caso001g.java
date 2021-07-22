import javax.swing.JOptionPane;

public class Caso001g {

	static Categoria[] categoria;
	static Categoria novaCategoria;

	static int menu;

	static class Cardapio {
		int codigoCard, quantidadePessoas;
		String descricaoCard;
		double precoCard;

	}

	static class Categoria {
		int codigoCat;
		String descricaoCat;
		Cardapio cardapio;
	}

	public static void main(String[] args) {

		//Inicia vetor
		categoria = new Categoria[1];
		
		
		do {
			menu = 0;
			menu = Integer.parseInt(JOptionPane.showInputDialog(
					"\n1 - Gerenciar Categoria" + "\n2 - Gerenciar Item" + "\n3 - Encerrar aplicação"));

			if (menu >= 1 && menu <= 3) {
				subMenu(menu);
			} else {
				menu = 1;
				System.out.println("Digite uma opcao valida");
			}

		} while (menu > 0 && menu != 3);

	}

	// Inicia o submenu de todas opcoes
	private static void subMenu(int menuu) {

		switch (menuu) {
		case 1:
			
			do {
				menuu = Integer.parseInt(JOptionPane
						.showInputDialog("\n1 - Adicionar Categoria" + "\n2 - Editar Categoria" + "\n3 - Voltar"));
				
				if (menuu == 1) {
					
					
				
					for (int i = 0; i < categoria.length; i++) {
						novaCategoria = new Categoria();
						categoria[i].codigoCat = 1;
						//novaCategoria.condigoCat = 1;
						if (categoria[i] != null) {
							System.out.println("Entrou");
						}
						
					}
					
					System.out.println("menuu 1");
					
				} else if(menuu == 2) {
					System.out.println("menuu 2");
				} else if(menuu <= 0 || menuu >= 4) {
					System.out.println("Digite uma opção valida");
					menuu = 1;
				}
				
			} while (menuu > 0 && menuu != 3);
			
			break;
		case 2:

			break;

		default:
			break;
		}

	}

}
