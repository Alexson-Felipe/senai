package Case;

import javax.swing.JOptionPane;

public class Caso05 {

	static int codigo, quantidade;
	static double valor;

	public static void main(String[] args) {

		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código:" + "\n100 Cachorro Quente R$1,10 "
				+ "\n101 Bauru Simples R$1,30 " + "\n102 Bauru c/ovo R$1,50 " + "\n103 Hamburger R$1,10 "
				+ "\n104 Cheeseburger R$1,30 " + "\n105 Refrigerante R$1,00"));

		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quanidade"));

		switch (codigo) {
		case 100:
			valor = quantidade * 1.10;
			break;
		case 101:
			valor = quantidade * 1.30;
			break;
		case 102:
			valor = quantidade * 1.50;
			break;
		case 103:
			valor = quantidade * 1.10;
			break;
		case 104:
			valor = quantidade * 1.30;
			break;
		case 105:
			valor = quantidade * 1.00;
			break;
		default:
		}
		JOptionPane.showMessageDialog(null, "valor a ser pago é: R$" + valor);

	}

}
