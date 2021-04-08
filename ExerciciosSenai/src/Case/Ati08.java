package Case;

import javax.swing.JOptionPane;

public class Ati08 {

	static int pref, prefint, prefbr, quant;
	static double valor;

	public static void main(String[] args) {

		pref = Integer.parseInt(JOptionPane.showInputDialog("PARA PRATOS \n[1] - Italiano \n[2] - Brasileiro"));

		switch (pref) {

		// Prato Italiano.
		case 1:

			prefint = Integer.parseInt(JOptionPane.showInputDialog(
					"PRATOS ITALIANOS \n1 - Lasanha Bolonhesa R$27,90 \n2 - Pizza de Calabresa R$29,90 \n3 - Macarrão a Carbonara R$24,90"));
			quant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));

			switch (prefint) {
			case 1:
				valor = 27.90 * quant;
				JOptionPane.showMessageDialog(null,
						"O Prato pedido foi -Lasanha Bolonhesa- \nA quantidade solicitada foi: " + quant
								+ "\n Total a pagar: R$" + valor);
				break;
			case 2:
				valor = 29.90 * quant;
				JOptionPane.showMessageDialog(null,
						"O Prato pedido foi -Pizza de Calabresa- \nA quantidade solicitada foi: " + quant
								+ "\n Total a pagar: R$" + valor);
				break;
			case 3:
				valor = 24.90 * quant;
				JOptionPane.showMessageDialog(null,
						"O Prato pedido foi -Macarrão a Carbonara- \nA quantidade solicitada foi: " + quant
								+ "\n Total a pagar: R$" + valor);
				break;
			}

			break;

		// Prato Brasileiro.
		case 2:
			prefbr = Integer.parseInt(JOptionPane.showInputDialog(
					"PRATOS BRASILEIRO \n1 - Arroz e Feijão R$18,90 \n2 - Feijoada R$29,90 \n3 - Moqueca R$24,90 \n4 - Churrasco R$39,90"));
			quant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));

			switch (prefbr) {
			case 1:
				valor = 18.90 * quant;
				JOptionPane.showMessageDialog(null,
						"O Prato pedido foi -Arroz e Feijão- \nA quantidade solicitada foi: " + quant
								+ "\n Total a pagar: R$" + valor);
				break;
			case 2:
				valor = 29.90 * quant;
				JOptionPane.showMessageDialog(null, "O Prato pedido foi -Feijoada- \nA quantidade solicitada foi: "
						+ quant + "\n Total a pagar: R$" + valor);
				break;
			case 3:
				valor = 24.90 * quant;
				JOptionPane.showMessageDialog(null, "O Prato pedido foi -Moqueca- \nA quantidade solicitada foi: "
						+ quant + "\n Total a pagar: R$" + valor);
				break;
			case 4:
				valor = 39.90 * quant;
				JOptionPane.showMessageDialog(null, "O Prato pedido foi -Churrasco- \nA quantidade solicitada foi: "
						+ quant + "\n Total a pagar: R$" + valor);
				break;
			}

			break;
	
		}

	}

}
