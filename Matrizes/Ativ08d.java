import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que controle o carrinho de compras de um supermercado.
 * O aplicativo deve permitir o cadastro de atÃ© 10 produtos. O programa deve
 * permitir incluir as seguintes informaÃ§Ãµes para cada produto.
 * 
 * Código
 * Descrição
 * Quantidade 
 * Valor Unitário 
 * Subtotal
 * 
 * O menu principal do sistema deve conter as seguintes opÃ§Ãµes:
 *
 * 1 - Adicionar produto ao carrinho 
 * 2 - Remover produto por código 
 * 
 * â—� Deve ser realizada uma busca no programa pelo cÃ³digo informado pelo usuÃ¡rio e caso o mesmo seja encontrado, deve ser atribuÃ­do null nos atributos do carrinho. 
 * 
 * 3 - Ver carrinho
 * 
 * â—� Listar todos os produtos, quantidade comprada, subtotal e total 
 * 
 * 4 - Ir para checkout 
 * 
 * â—� Mostrar toda a lista dos produtos comprados e o total da venda e depois apresentar a mensagem â€œâ€�Compra realizada com Sucessoâ€� e fechar o programa.
 * 
 */
public class Ativ08d {

	static String[][] produtos;
	static int menu;
	
	public static void main(String[] args) {
		
		int linha = 1;
		produtos = new String[linha][5];
		
		
		//MENU
		do {
			
			menu = Integer.parseInt(JOptionPane.showInputDialog("[1] - Adicionar produto ao carrinho\n"
					+ "[2] - Remover produto por código\n" + "[3] - Ver carrinho\n" + "[4] ?"
							+ "- Ir para checkout\n"));
			
			switch (menu) {
			case 1:
				
				// Obs = Criar uma variavel de controle
				
				for (int i = 0; i < linha; i++) {
					if (produtos[i][0].equals("")) {

						System.out.println("test");

					}
					produtos[i][0] = JOptionPane.showInputDialog("Código " + i );
					///produtos[i][1] = JOptionPane.showInputDialog("DescriÃ§Ã£o");
					//produtos[i][2] = JOptionPane.showInputDialog("Quantidade");
					//produtos[i][3] = JOptionPane.showInputDialog("Valor unitario");
					//produtos[i][4] = JOptionPane.showInputDialog("Subtotal");
				// else {
						
						
					//}

				}
				
				break;

			default:
				break;
			}
			
		} while (menu < 5);
		
		
		
		for (int i = 0; i < linha; i++) {
			
			
			
		}
		

		
	}

}
