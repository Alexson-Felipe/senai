package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati10 {

	static char carteira;

	public static void main(String[] args) {

		carteira = JOptionPane.showInputDialog("Digite A para Moto e B para Carro").charAt(0);

		switch (carteira) {
		case 'A':
		case 'a':
			JOptionPane.showMessageDialog(null, "Carteira para Moto");
			break;
		case 'B':
		case 'b':
			JOptionPane.showMessageDialog(null, "Carteira para Carro");
			break;
		}

	}

}
