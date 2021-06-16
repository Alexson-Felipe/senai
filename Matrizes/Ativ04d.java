import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que gerencie as compras de uma padaria. Em toda venda
 * é preciso armazenar o nome da pessoa, telefone e o total que ela comprou. O
 * programa deve permitir cadastrar 6 vendas. Depois das vendas cadastradas o
 * programa deve listar todas as vendas com seus respectivos dados e por final o
 * valor faturado no dia.
 *
 */

public class Ativ04d {

	static String[][] pessoas;
	static double soma;

	public static void main(String[] args) {

		pessoas = new String[6][3];

		for (int i = 0; i < 6; i++) {

			pessoas[i][0] = JOptionPane.showInputDialog("Nome");
			pessoas[i][1] = JOptionPane.showInputDialog("Telefone");
			pessoas[i][2] = JOptionPane.showInputDialog("Valor comprado");

			// JOptionPane.showMessageDialog(null,
			// "Cliente " + pessoas[i][0] + " de telefone " + pessoas[i][1] + " comprou R$"
			// + pessoas[i][2]);

			soma += Double.parseDouble(pessoas[i][2]);

		}

		System.out.println("O valor total comprado é de: " + soma);

	}

}
