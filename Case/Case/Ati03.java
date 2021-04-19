package Case;

import javax.swing.JOptionPane;

public class Ati03 {
	
	static int produto;
	static double valor;

	public static void main(String[] args) {
		
		produto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto:"));
		
		switch(produto) {
		case 30:
			valor = produto * 1.20;
			break;
		case 40:
			valor = produto * 1.15;
			break;
		case 50:
			valor = produto * 1.10;
			break;
		}
		JOptionPane.showMessageDialog(null, String.format("valor com o lucro R$ %.2f", valor));

	}

}
